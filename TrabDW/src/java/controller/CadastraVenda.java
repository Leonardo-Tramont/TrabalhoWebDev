package controller;

import model.Cliente;
import model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CadastraVenda", urlPatterns = {"/CadastraVenda"})
public class CadastraVenda extends HttpServlet {
    Connection conexao = null;
    
    @Override
    public void init() throws ServletException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/trab_dw", "root", "");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro!");
        } catch (SQLException ex) {
            System.out.println("Erro!!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int quantidade = Integer.parseInt(request.getParameter("inputQuantVendas"));
        String data = request.getParameter("inputDataVendas");
        int idCliente = Integer.parseInt(request.getParameter("idCliVendas"));
        int idProduto = Integer.parseInt(request.getParameter("idProdVendas"));
        int idVendedor = Integer.parseInt(request.getParameter("idVendVendas"));
        
        try {
            PreparedStatement consulta = conexao.prepareStatement("SELECT preco_venda, quantidade_disponível FROM produtos WHERE id=?");
            consulta.setInt(1, idProduto);
            
            ResultSet resultado = consulta.executeQuery();
            
            Produto prod = new Produto();
            if (resultado != null) {
                
                while(resultado.next()) {
                    prod.precoVenda = Double.parseDouble(resultado.getString("preco_venda"));
                    prod.quantDisp = Integer.parseInt(resultado.getString("quantidade_disponível"));
                }
                consulta.close();
                
                RequestDispatcher dispatcher = request.getRequestDispatcher("/Sucesso.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/NoData.jsp");
                dispatcher.forward(request, response);
            }
            
            double precoVenda = prod.precoVenda * (double)quantidade;
          
            PreparedStatement insert = conexao.prepareStatement("INSERT INTO vendas(quantidade_venda,data_venda,valor_venda,id_cliente,id_produto,id_funcionario) VALUES (?, ?, ?, ?, ?, ?)");
            
            insert.setInt(1, quantidade);
            insert.setString(2, data);
            insert.setDouble(3, precoVenda);
            insert.setInt(4, idCliente);
            insert.setInt(5, idProduto);
            insert.setInt(6, idVendedor);
            
            insert.executeUpdate();
            
            PreparedStatement update = conexao.prepareStatement("UPDATE produtos SET quantidade_disponível = ? WHERE id = ?");
            
            update.setInt(1, prod.quantDisp-quantidade);
            update.setInt(2, idProduto);
            
            update.executeUpdate();
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Sucesso.jsp");
            dispatcher.forward(request, response);
            
        } catch (SQLException ex) {
            System.out.println("Erro na consulta SQL");
        }
    }
}
