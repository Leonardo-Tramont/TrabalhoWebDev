package controller;

import aplicacao.Cliente;
import aplicacao.Funcionario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ProcessaLogin", urlPatterns = {"/ProcessaLogin"})
public class ProcessaLogin extends HttpServlet {
    
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
        String cpf = request.getParameter("inserirCpf1");
        String senha = request.getParameter("inserirSenha1");
        
        try {
            String consulta = "SELECT * FROM funcionarios WHERE cpf= '" + cpf + "' AND senha = '" + senha + "'";
            PreparedStatement statement = conexao.prepareStatement(consulta);
            ResultSet resultado = statement.executeQuery();
            
            Funcionario func = new Funcionario();
            
            if (resultado != null) {
                while(resultado.next()) {
                    func.id = Integer.parseInt(resultado.getString("id"));
                    func.nome = resultado.getString("nome");
                    func.cpf = resultado.getString("cpf");
                    func.senha = resultado.getString("senha");
                    func.papel = resultado.getString("papel");
                }
                
                if ("1".equals(func.papel)) {
                    response.sendRedirect("menu_vendedor.jsp");
                } else if ("2".equals(func.papel)) {
                    response.sendRedirect("cadastro_venda.jsp");
                } else {
                    response.sendRedirect("index.jsp");
                }
            }
        } catch (SQLException ex) {
            System.out.println("<h1>Erro"+ex.getMessage()+"</h1>");
        }
    }
}
