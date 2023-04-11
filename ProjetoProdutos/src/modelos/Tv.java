package modelos;

public class Tv extends Produtos {

    //Atributos Tv
    protected String modelo;
    protected String marca;
    protected String sistemaOperacional;
    protected float tamanhoDaTela;

    //Metodos
    //Construtor 01
    public Tv() {
        super();
        this.modelo = "";
        this.marca = "";
        this.sistemaOperacional = "";
        this.tamanhoDaTela = 0;
    }

    //Construtor 02
    public Tv(int codigo, float preco, String modelo, String marca, String sistemaOperacional, float tamanhoDaTela) throws Exception {
        super(codigo, preco);
        this.modelo = modelo;
        this.marca = marca;
        this.sistemaOperacional = sistemaOperacional;
        if (tamanhoDaTela <= 0) {
            throw new Exception("Tamanho da tela inválido!");
        }
        this.tamanhoDaTela = tamanhoDaTela;
    }

    //Metodos get e set
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public float getTamanhoDaTela() {
        return tamanhoDaTela;
    }

    public void setTamanhoDaTela(float tamanhoDaTela) throws Exception {
        if (tamanhoDaTela <= 0) {
            throw new Exception("Tamanho da tela inválido!");
        }
        this.tamanhoDaTela = tamanhoDaTela;
    }

    @Override
    public String obterDescricaoCompletaDoproduto() {
        return "Modelo: " + modelo + "\n"
                + "Marca: " + marca + "\n"
                + "Sistema Operacional: " + sistemaOperacional + "\n"
                + "Tamanho da Tela: " + tamanhoDaTela+" Polegadas";
    }

    @Override
    public float obterPrecoDeVendaDoProduto() {
        return preco;
    }

    @Override
    public String obterTipoDoProduto() {
        return "TV";
    }

}
