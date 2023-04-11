
package modelos;

public class Veiculo {
    //Atributos
    protected String modeloDoVeiculo;
    protected boolean veiculoLigado;

    //Metodos
    public Veiculo(){
        this.modeloDoVeiculo = "";
        this.veiculoLigado = false;
    }
    public Veiculo(String modeloDoVeiculo, boolean veiculoLigado) {
        this.modeloDoVeiculo = modeloDoVeiculo;
        this.veiculoLigado = veiculoLigado;
    }
    
    //Metodos get e set

    public String getModeloDoVeiculo() {
        return modeloDoVeiculo;
    }

    public void setModeloDoVeiculo(String modeloDoVeiculo) {
        this.modeloDoVeiculo = modeloDoVeiculo;
    }

    public boolean isVeiculoLigado() {
        return veiculoLigado;
    }

    public void setVeiculoLigado(boolean veiculoLigado) {
        this.veiculoLigado = veiculoLigado;
    }
    
    
    
}
