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

@WebServlet(name = "IncluiCliente", urlPatterns = {"/IncluiCliente"})
public class IncluiCliente extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        Cliente cliente = new Cliente();
 
        cliente.setNome(request.getParameter("inputNomeCli"));
        cliente.setCpf(request.getParameter("inputCpfCli"));
        cliente.setEndereco(request.getParameter("inputEndCli"));
        cliente.setBairro(request.getParameter("inputBairroCli"));
        cliente.setCidade(request.getParameter("inputCidadeCli"));
        cliente.setUf(request.getParameter("inputEstadoCli"));
        cliente.setCep(request.getParameter("inputCepCli"));
        cliente.setTelefone(request.getParameter("inputTelCli"));
        cliente.setEmail( request.getParameter("inputEmailCli"));
        
            
        ClienteDAO clientedao = new ClienteDAO();
            
        if (clientedao.incluir(cliente)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Sucesso.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/NoData.jsp");
            dispatcher.forward(request, response);
        }
    }
}
