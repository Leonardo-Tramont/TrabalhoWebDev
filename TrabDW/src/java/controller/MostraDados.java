package controller;

import aplicacao.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "MostraDados", urlPatterns = {"/MostraDados"})
public class MostraDados extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        try {
            String consulta = "SELECT id, nome, cpf FROM clientes";
            PreparedStatement statement = conexao.prepareStatement(consulta);
            ResultSet resultado = statement.executeQuery();
            
            if (resultado != null) {
                ArrayList<Cliente> clientes = new ArrayList<Cliente>();
                
                while(resultado.next()) {
                    Cliente cliente = new Cliente(Integer.parseInt(resultado.getString("id")), resultado.getString("nome"), resultado.getString("cpf"));
                    clientes.add(cliente);
                }
                
                request.setAttribute("ClientesCadastrados", clientes);
                statement.close();
                
                RequestDispatcher dispatcher = request.getRequestDispatcher("/ClientesView.jsp");
                dispatcher.forward(request, response);
            }
            
            else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/NoData.jsp");
                dispatcher.forward(request, response);
            }
            
        } catch (SQLException ex) {
            out.println("<h1>Erro"+ex.getMessage()+"</h1>");
        }
    }
    
    @Override
    public void destroy() {
        try {
            conexao.close();
        } catch(SQLException ex) {
            System.out.println("Não foi possível encerrar a conexao");
        }
    }
}
