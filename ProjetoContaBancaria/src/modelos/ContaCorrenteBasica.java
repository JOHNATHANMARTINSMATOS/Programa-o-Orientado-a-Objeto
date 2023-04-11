package modelos;

public class ContaCorrenteBasica extends ContaGeral implements IContaGeral {

    //Metodos
    //Construtor 01
    public ContaCorrenteBasica() {
        super();
    }

    //Construtor 02
    public ContaCorrenteBasica(String nome, long cpf, int agencia, int conta, float saldo) throws Exception {
        super(nome, cpf, agencia, conta, saldo);
    }

    // Metodo de calcular tarifa
    public float calcularTarifa() {
        float tarifa = (float) 19.90;
        saldo -= tarifa;
        return tarifa;
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
        saldo += sacar;
        return sacar;
    }

    @Override
    public float emitirSaldo() {
        return saldo;
    }

}
