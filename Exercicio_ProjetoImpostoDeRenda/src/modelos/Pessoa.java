
package modelos;

public class Pessoa {
    
    //Atributos
    protected String nome;
    protected String endereco;
    protected long telefone;
    protected String email;
    protected float rendaBruta;
    
    //Metodos
    
    //Contrutor 01
    
    public Pessoa(){
        
    }
    
    //Construtor 02

    public Pessoa(String nome, String endereco, long telefone, String email, float rendaBruta)throws Exception{
        this.nome = nome;
        this.endereco = endereco;
        if(telefone <= 0) throw new Exception("telefone não pode ser menor ou igual a zero!");
        this.telefone = telefone;
        this.email = email;
        if(rendaBruta <= 0) throw new  Exception("Renda deve ser maior que zero!");
        this.rendaBruta = rendaBruta;
    }
    
    //Metodos get e set

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

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone)throws Exception{
        if(telefone <= 0) throw new Exception("telefone não pode ser menor ou igual a zero!");
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(float rendaBruta)throws Exception{
        if(rendaBruta <= 0) throw new  Exception("Renda deve ser maior que zero!");
        this.rendaBruta = rendaBruta;
    }
    
    
    
}
