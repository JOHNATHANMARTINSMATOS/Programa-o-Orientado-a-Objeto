
package modelos;

public class Automovel extends Veiculo implements IVeiculo{

    public Automovel() {
       super();
    }

    public Automovel(String modeloDoVeiculo, boolean veiculoLigado) {
        super(modeloDoVeiculo, veiculoLigado);
    }
    
    @Override
    public String statusDoVeiculo(){
        if(veiculoLigado == true) return """
                                         ---Veiculo ligado---
                                         Tipo: Automovel 
                                         Modelo: """+modeloDoVeiculo;
        return """
               ---Veiculo Desligado---
               Tipo: Automovel 
               Modelo: """+modeloDoVeiculo;
    }
}
