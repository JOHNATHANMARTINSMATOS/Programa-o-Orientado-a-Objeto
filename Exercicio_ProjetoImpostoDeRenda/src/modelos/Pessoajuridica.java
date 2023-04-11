
package modelos;

public class Pessoajuridica extends Pessoa implements IPessoa{
    // Atributos
    protected long cnpj;
    protected String razaoSocial;
    
    //Metodos
    
    //Construtor 01

    public Pessoajuridica() {
        this.cnpj = 0;
        this.razaoSocial = "";
    }

    //Construtor 02
    
    public Pessoajuridica(long cnpj, String razaoSocial, String nome, String endereco, long telefone, String email, float rendaBruta) throws Exception {
        super(nome, endereco, telefone, email, rendaBruta);
        if(cnpj <=0)throw new Exception("CNPJ Inválido!");
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
    
    //Metodos get e set

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj)throws Exception{
        if(cnpj <=0)throw new Exception("CNPJ Inválido!");
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    @Override
    public float calcularImpostoDeRenda(){
        return (float) (rendaBruta * 0.20);
    }
}
    
  

