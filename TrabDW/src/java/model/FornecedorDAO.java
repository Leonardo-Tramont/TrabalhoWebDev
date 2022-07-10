package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "FornecedorDAO", urlPatterns = {"/FornecedorDAO"})
public class FornecedorDAO extends HttpServlet {

    private Connection conexao;
    
    public FornecedorDAO() {
        try {
            conexao = Conexao.criaConexao();
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean incluirFornecedor(Fornecedor fornecedor) {
        try {
            PreparedStatement insert = conexao.prepareStatement("insert into fornecedores(razao_social, cnpj, endereco, bairro, cidade, uf, cep, telefone, email) values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            insert.setString(1, fornecedor.getRazao());
            insert.setString(2, fornecedor.getCnpj());
            insert.setString(3, fornecedor.getEndereco());
            insert.setString(4, fornecedor.getBairro());
            insert.setString(5, fornecedor.getCidade());
            insert.setString(6, fornecedor.getUf());
            insert.setString(7, fornecedor.getCep());
            insert.setString(8, fornecedor.getTelefone());
            insert.setString(9, fornecedor.getEmail());
            
            insert.execute();
            
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
