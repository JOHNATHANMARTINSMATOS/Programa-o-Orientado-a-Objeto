package modelos;

public class ContaCorrenteComLimite extends ContaCorrenteBasica{

    //Metodos
    //Construtor 01
    public ContaCorrenteComLimite() {
        super();
    }

    //Construtor 02
    public ContaCorrenteComLimite(String nome, long cpf, int agencia, int conta, float saldo) throws Exception {
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

    //Metodo limite da conta
    public float calcularLimite() throws Exception {
        float limite = 1000;
        saldo = saldo + limite;
        return limite;
    }

    // Metodo de calcular tarifa
    @Override
    public float calcularTarifa() {
        float tarifa = (float) 19.90;
        saldo -= tarifa;
        return tarifa;
    }

    @Override
    public float sacar(float sacar) throws Exception {
        if (sacar <= 0) {
            throw new Exception("Digite valor maior que zero!");
        }
        saldo = saldo - sacar;
        return sacar;
    }

    @Override
    public float emitirSaldo() {
        return saldo;
    }

}
