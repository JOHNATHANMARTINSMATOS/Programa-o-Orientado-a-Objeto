
package modelos;

public class Notebook extends Produtos {

    //Atributos notebook
    protected String marca;
    protected String modelo;
    protected int memóriaRam;
    protected int capacidadeHd;
    protected String processador;
    protected float tamanhoDaTela;
    protected String sistemaOperacional;

    //Metodos
    //Construtor 01
    public Notebook() {
        super();
        this.marca = "";
        this.modelo = "";
        this.memóriaRam = 0;
        this.capacidadeHd = 0;
        this.processador = "";
        this.tamanhoDaTela = 0;
        this.sistemaOperacional = "";

    }

    //Construtor 02
    public Notebook(String marca, String modelo, int memóriaRam, int capacidadeHd, String processador,
            float tamanhoDaTela, String sistemaOperacional, int codigo, float preco) throws Exception {
        super(codigo, preco);
        this.marca = marca;
        this.modelo = modelo;
        if (memóriaRam <= 0) {
            throw new Exception("Memoria RAM inválida!");
        }
        this.memóriaRam = memóriaRam;
        if (capacidadeHd <= 0) {
            throw new Exception("Capacidade do HD/SSD inválida!");
        }
        this.capacidadeHd = capacidadeHd;
        this.processador = processador;
        if (tamanhoDaTela <= 0) {
            throw new Exception("Tamanho da tela inválido!");
        }
        this.tamanhoDaTela = tamanhoDaTela;
        this.sistemaOperacional = sistemaOperacional;
    }

    //Metodos get e set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemóriaRam() {
        return memóriaRam;
    }

    public void setMemóriaRam(int memóriaRam) throws Exception {
        if (memóriaRam <= 0) {
            throw new Exception("Memoria RAM inválida!");
        }
        this.memóriaRam = memóriaRam;
    }

    public int getCapacidadeHd() {
        return capacidadeHd;
    }

    public void setCapacidadeHd(int capacidadeHd) throws Exception {
        if (capacidadeHd <= 0) {
            throw new Exception("Capacidade do HD/SSD inválida!");
        }
        this.capacidadeHd = capacidadeHd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
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

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String obterDescricaoCompletaDoproduto() {
        return "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Memoria RAM: " + memóriaRam +"GB" + "\n"
                + "Capacidade HD/SSD: " + capacidadeHd +" GB" + "\n"
                + "Processador: " + processador + "\n"
                + "Tamanho da Tela: " + tamanhoDaTela +" Polegadas"+ "\n"
                + "Sistema Operacional: " + sistemaOperacional;

    }

    @Override
    public float obterPrecoDeVendaDoProduto() {

        return preco;

    }

    @Override
    public String obterTipoDoProduto() {

        return "Notebook";

    }


}
