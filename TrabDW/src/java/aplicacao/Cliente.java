package aplicacao;

public class Cliente {
    public int id;
    public String nome;
    public String cpf;
    public String endereco;
    public String bairro;
    public String cidade;
    public String uf;
    public String cep;
    public String telefone;
    public String email;
    
    public Cliente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
}
