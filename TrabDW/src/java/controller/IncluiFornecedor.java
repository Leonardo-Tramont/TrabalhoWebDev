package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Fornecedor;
import model.FornecedorDAO;

@WebServlet(name = "IncluiFornecedor", urlPatterns = {"/IncluiFornecedor"})
public class IncluiFornecedor extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Fornecedor fornecedor = new Fornecedor();
        
        fornecedor.setRazao(request.getParameter("inputRazaoSocialFornecedor"));
        fornecedor.setCnpj(request.getParameter("inputCNPJFornecedor"));
        fornecedor.setEndereco(request.getParameter("inputEndForn"));
        fornecedor.setBairro(request.getParameter("inputBairroForn"));
        fornecedor.setCidade(request.getParameter("inputCidadeForn"));
        fornecedor.setUf(request.getParameter("inputEstadoForn"));
        fornecedor.setCep(request.getParameter("inputCepForn"));
        fornecedor.setTelefone(request.getParameter("inputTelForn"));
        fornecedor.setEmail( request.getParameter("inputEmailForn"));
        
        FornecedorDAO fornecedordao = new FornecedorDAO();
            
        if (fornecedordao.incluirFornecedor(fornecedor)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Sucesso.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/NoData.jsp");
            dispatcher.forward(request, response);
        }
    }
}
