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
import model.Cliente;
import model.ClienteDAO;


@WebServlet(name = "EditaCliente", urlPatterns = {"/EditaCliente"})
public class EditaCliente extends HttpServlet {    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Cliente cliente = new Cliente();
 
        cliente.setId(Integer.parseInt(request.getParameter("IdCliEdi")));
        cliente.setNome(request.getParameter("nomeCliEdi"));
        cliente.setCpf(request.getParameter("cpfCliEdi"));
        cliente.setEndereco(request.getParameter("endCliEdi"));
        cliente.setBairro(request.getParameter("bairroCliEdi"));
        cliente.setCidade(request.getParameter("cidadeCliEdi"));
        cliente.setUf(request.getParameter("estadoCliEdi"));
        cliente.setCep(request.getParameter("cepCliEdi"));
        cliente.setTelefone(request.getParameter("telCliEdi"));
        cliente.setEmail( request.getParameter("emailCliEdi"));
        
        ClienteDAO clientedao = new ClienteDAO();
            
        if (clientedao.editarCliente(cliente)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Sucesso.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/NoData.jsp");
            dispatcher.forward(request, response);
        }
    }
}
