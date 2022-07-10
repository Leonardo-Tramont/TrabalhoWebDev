package controller;

import model.Cliente;
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
import model.ClienteDAO;


@WebServlet(name = "MostraDados", urlPatterns = {"/MostraDados"})
public class MostraDados extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        ArrayList<Cliente> clientes = new ArrayList<>();
        ClienteDAO clientedao = new ClienteDAO();
        
        clientes = clientedao.getLista();
        
        request.setAttribute("ClientesCadastrados", clientes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ClientesView.jsp");
        dispatcher.forward(request, response);
    }
    
}
