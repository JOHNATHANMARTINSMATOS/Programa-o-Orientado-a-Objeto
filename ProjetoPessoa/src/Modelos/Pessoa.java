package Modelos;

public class Pessoa {

    //Atributos
    protected String nome = " ";
    protected String endereco = " ";
    protected int telefone = 0;
    protected String email = " ";

    //Metodos
    //Construtor 01
    public Pessoa() {
        this.nome = " ";
        this.endereco = " ";
        this.telefone = 0;
        this.email = " ";
    }

    //Construtor 02
    public Pessoa(String nome, String endereco, int telefone, String email) throws Exception {
        this.nome = nome;
        this.endereco = endereco;
        if (telefone <= 0) {
            throw new Exception("telefone inválido!");
        }
        this.telefone = telefone;
        this.email = email;
    }

    //Metodo Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) throws Exception {
        if (telefone <= 0) {
            throw new Exception("telefone inválido!");
        }
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome: " + nome + "/n endereco: " + endereco + "/n telefone: " + telefone + "/n email: " + email + '}';
    }

}
