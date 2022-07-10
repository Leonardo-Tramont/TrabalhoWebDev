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


@WebServlet(name = "EditaCliente", urlPatterns = {"/EditaCliente"})
public class EditaCliente extends HttpServlet {
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
 
        int id = Integer.parseInt(request.getParameter("idCliEdi"));
        String nome = request.getParameter("nomeCliEdi");
        String cpf = request.getParameter("cpfCliEdi");
        String endereco = request.getParameter("endCliEdi");
        String bairro = request.getParameter("bairroCliEdi");
        String cidade = request.getParameter("cidadeCliEdi");
        String uf = request.getParameter("estadoCliEdi");
        String cep = request.getParameter("cepCliEdi");
        String telefone = request.getParameter("telCliEdi");
        String email = request.getParameter("emailCliEdi");
        
        try {
            PreparedStatement insert = conexao.prepareStatement("update clientes set nome=?, cpf=?, endereco=?, bairro=?, cidade=?, uf=?, cep=?, telefone=?, email=? where id=?");
            
            insert.setString(1, nome);
            insert.setString(2, cpf);
            insert.setString(3, endereco);
            insert.setString(4, bairro);
            insert.setString(5, cidade);
            insert.setString(6, uf);
            insert.setString(7, cep);
            insert.setString(8, telefone);
            insert.setString(9, email);
            insert.setInt(10, id);
            
            insert.executeUpdate();
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Sucesso.jsp");
            dispatcher.forward(request, response);
  
        } catch (SQLException ex) {
            System.out.println("<h1>Erro"+ex.getMessage()+"</h1>");
        }
    }
}
