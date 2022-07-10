package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "IncluiCliente", urlPatterns = {"/IncluiCliente"})
public class IncluiCliente extends HttpServlet {
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
 
        String nome = request.getParameter("inputNomeCli");
        String cpf = request.getParameter("inputCpfCli");
        String endereco = request.getParameter("inputEndCli");
        String bairro = request.getParameter("inputBairroCli");
        String cidade = request.getParameter("inputCidadeCli");
        String uf = request.getParameter("inputEstadoCli");
        String cep = request.getParameter("inputCepCli");
        String telefone = request.getParameter("inputTelCli");
        String email = request.getParameter("inputEmailCli");
        
        try {
            PreparedStatement insert = conexao.prepareStatement("insert into clientes(nome, cpf, endereco, bairro, cidade, uf, cep, telefone, email) values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            insert.setString(1, nome);
            insert.setString(2, cpf);
            insert.setString(3, endereco);
            insert.setString(4, bairro);
            insert.setString(5, cidade);
            insert.setString(6, uf);
            insert.setString(7, cep);
            insert.setString(8, telefone);
            insert.setString(9, email);
            
            insert.executeUpdate();
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Sucesso.jsp");
            dispatcher.forward(request, response);
  
        } catch (SQLException ex) {
            System.out.println("<h1>Erro"+ex.getMessage()+"</h1>");
        }
    }
}
