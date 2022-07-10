package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ClienteDAO", urlPatterns = {"/ClienteDAO"})
public class ClienteDAO extends HttpServlet {
    
    private Connection conexao;
    
    public ClienteDAO() {
        try {
            conexao = Conexao.criaConexao();
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Cliente> getLista() {
        
        ArrayList<Cliente> clientesRetorno = new ArrayList<>();
        
        try {
            PreparedStatement consulta = conexao.prepareStatement("SELECT * FROM clientes");
            ResultSet resultado = consulta.executeQuery();
            
            while (resultado.next()) {
                Cliente cliente = new Cliente();
                
                cliente.setId(resultado.getInt("id"));
                cliente.setNome(resultado.getString("nome"));
                cliente.setCpf(resultado.getString("cpf"));
                cliente.setEndereco(resultado.getString("endereco"));
                cliente.setBairro(resultado.getString("bairro"));
                cliente.setCidade(resultado.getString("cidade"));
                cliente.setUf(resultado.getString("uf"));
                cliente.setCep(resultado.getString("cep"));
                cliente.setTelefone(resultado.getString("telefone"));
                cliente.setEmail(resultado.getString("email"));
                
                clientesRetorno.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return clientesRetorno;
    }
    
    public Cliente buscaCliente(int idBusca) {
        Cliente cliente = new Cliente();
        
        try {
            PreparedStatement consulta = conexao.prepareStatement("SELECT * FROM clientes WHERE id = ?");
            
            consulta.setInt(1, idBusca);
            ResultSet resultado = consulta.executeQuery();
            
            if(resultado.next()) {
                cliente.setId(resultado.getInt("id"));
                cliente.setNome(resultado.getString("nome"));
                cliente.setCpf(resultado.getString("cpf"));
                cliente.setEndereco(resultado.getString("endereco"));
                cliente.setBairro(resultado.getString("bairro"));
                cliente.setCidade(resultado.getString("cidade"));
                cliente.setUf(resultado.getString("uf"));
                cliente.setCep(resultado.getString("cep"));
                cliente.setTelefone(resultado.getString("telefone"));
                cliente.setEmail(resultado.getString("email"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cliente;
    }
    
    public boolean incluir(Cliente cliente) {
        try {
            PreparedStatement insert = conexao.prepareStatement("insert into clientes(nome, cpf, endereco, bairro, cidade, uf, cep, telefone, email) values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            insert.setString(1, cliente.getNome());
            insert.setString(2, cliente.getCpf());
            insert.setString(3, cliente.getEndereco());
            insert.setString(4, cliente.getBairro());
            insert.setString(5, cliente.getCidade());
            insert.setString(6, cliente.getUf());
            insert.setString(7, cliente.getCep());
            insert.setString(8, cliente.getTelefone());
            insert.setString(9, cliente.getEmail());
            
            insert.execute();
            
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean editarCliente(Cliente cliente) {
        try {
            PreparedStatement insert = conexao.prepareStatement("update clientes set nome=?, cpf=?, endereco=?, bairro=?, cidade=?, uf=?, cep=?, telefone=?, email=? where id=?");
            
            insert.setString(1, cliente.getNome());
            insert.setString(2, cliente.getCpf());
            insert.setString(3, cliente.getEndereco());
            insert.setString(4, cliente.getBairro());
            insert.setString(5, cliente.getCidade());
            insert.setString(6, cliente.getUf());
            insert.setString(7, cliente.getCep());
            insert.setString(8, cliente.getTelefone());
            insert.setString(9, cliente.getEmail());
            insert.setInt(10, cliente.getId());
            
            insert.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
