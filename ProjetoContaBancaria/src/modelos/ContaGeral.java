
package modelos;

public class ContaGeral {

    //Atributos
    protected String nome;
    protected long cpf;
    protected int agencia;
    protected int conta;
    protected float saldo;

    //Metodos
    //Construtor 01
    public ContaGeral() {
    }

    //Construtor 02
    public ContaGeral(String nome, long cpf, int agencia, int conta, float saldo) throws Exception {
        this.nome = nome;
        if (cpf <= 0) {
            throw new Exception("CPF Inválido!");
        }
        this.cpf = cpf;
        if (agencia <= 0) {
            throw new Exception("Agência Inválida!");
        }
        this.agencia = agencia;
        if (conta <= 0) {
            throw new Exception("Conta Inválida!");
        }
        this.conta = conta;
        this.saldo = saldo;
    }

    //Metodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) throws Exception {
        if (cpf <= 0) {
            throw new Exception("CPF Inválido!");
        }
        this.cpf = cpf;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) throws Exception {
        if (agencia <= 0) {
            throw new Exception("Agência Inválida!");
        }
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) throws Exception {
        if (conta <= 0) {
            throw new Exception("Conta Inválida!");
        }
        this.conta = conta;
    }

}
