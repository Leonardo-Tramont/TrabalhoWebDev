package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import model.ClienteDAO;

@WebServlet(name = "BuscaCliente", urlPatterns = {"/BuscaCliente"})
public class BuscaCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        Cliente clienteBusca = new Cliente();
 
        int idBusca = Integer.parseInt(request.getParameter("idCliBus"));
        
        ClienteDAO clientedao = new ClienteDAO();
        clienteBusca = clientedao.buscaCliente(idBusca);
        
        request.setAttribute("ClienteBuscado", clienteBusca);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/edicao_cliente.jsp");
        dispatcher.forward(request, response);
    }
}
