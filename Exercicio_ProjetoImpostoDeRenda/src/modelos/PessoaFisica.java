
package modelos;

public class PessoaFisica extends Pessoa implements IPessoa{
    //Atributos
    protected long cpf;
    protected String sexo;
    
    //Metodos

    //Contrutor 01
    public PessoaFisica() {
        super();
        this.cpf = 0;
        this.sexo = "";
    }

    //Construtor 02
    public PessoaFisica(long cpf, String sexo, String nome, String endereco, long telefone, String email, float rendaBruta) throws Exception {
        super(nome, endereco, telefone, email, rendaBruta);
        if(cpf <= 0 )throw new Exception("Cpf Inválido!");
        this.cpf = cpf;
        this.sexo = sexo;
    }
    
    //Metodos get e set

    public long getCpf() {
        return cpf;
    }

    public void setCpf(int cpf)throws Exception{
        if(cpf <= 0 )throw new Exception("Cpf Inválido!");
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public float calcularImpostoDeRenda(){
        if(rendaBruta <= 1400) return 0;
        if(rendaBruta <= 2100) return (float) (rendaBruta * 0.10);
        if(rendaBruta <= 2800) return(float)(rendaBruta * 0.15);
        if(rendaBruta <= 3600) return(float)(rendaBruta * 0.25);
        return (float)(rendaBruta * 0.30);
    }
   
}
