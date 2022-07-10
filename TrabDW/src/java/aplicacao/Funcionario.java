package aplicacao;


public class Funcionario {
    public int id;
    public String nome;
    public String cpf;
    public String senha;
    public String papel;
    
    public Funcionario(int id, String nome, String cpf, String senha, String papel) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.papel = papel;
    }
    
    public Funcionario() {
    }
}
