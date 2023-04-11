
package modelos;

public class ContaPoupanca extends ContaGeral implements IContaGeral {

    //Metodos
    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(String nome, long cpf, int agencia, int conta, float saldo) throws Exception {
        super(nome, cpf, agencia, conta, saldo);
    }

    @Override
    public float depositar(float depositar) throws Exception {
        if (depositar <= 0) {
            throw new Exception("Digite valor maior que zero!");
        }
        saldo += depositar;
        return depositar;

    }

    @Override
    public float sacar(float sacar) throws Exception {
        if (sacar <= 0) {
            throw new Exception("Digite valor maior que zero!");
        }
        saldo -= sacar;
        return sacar;

    }

    @Override
    public float emitirSaldo() {

        return saldo;

    }

    //Metodo da classe poupança
    public float calcularRendimento() {
        return (float) (saldo * 0.005);
    }

}
