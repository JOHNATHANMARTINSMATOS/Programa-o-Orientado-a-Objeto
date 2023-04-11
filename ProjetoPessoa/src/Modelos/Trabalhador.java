package Modelos;

public class Trabalhador extends Pessoa {

    //Atributos
    protected String funcao = " ";
    protected String departamento = " ";
    protected float salario = 0;

    //Metodos
    //Construtor 01
    public Trabalhador() {
        super();
        this.funcao = " ";
        this.departamento = " ";
        this.salario = 0;
    }

    //Construtor 02
    public Trabalhador(String nome, String endereco, int telefone, String email,
            String funcao, String departamento, float salario) throws Exception {

        super(nome, endereco, telefone, email);
        this.funcao = funcao;
        this.departamento = departamento;
        if (salario <= 0) {
            throw new Exception("Valor do Salario inválido!");
        }
        this.salario = salario;
    }

    //Metodos Get e Set
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) throws Exception {
        if (salario <= 0) {
            throw new Exception("Valor do Salario inválido!");
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabalhador{" + "Função: " + funcao + ", Departamento: " + departamento + ", Salario: R$" + salario + '}';
    }

}
