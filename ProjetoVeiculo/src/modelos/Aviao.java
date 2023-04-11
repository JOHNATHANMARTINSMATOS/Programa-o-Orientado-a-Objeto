
package modelos;


public class Aviao extends Veiculo implements IVeiculo{

    public Aviao() {
    }

    public Aviao(String modeloDoVeiculo, boolean veiculoLigado) {
        super(modeloDoVeiculo, veiculoLigado);
    }

    
 @Override
    public String statusDoVeiculo(){
        if(veiculoLigado == true) return """
                                         ---Veiculo ligado---
                                         Tipo: Avi\u00e3o 
                                         Modelo: """+modeloDoVeiculo;
        return """
               ---Veiculo Desligado---
               Tipo: Avião 
               Modelo: """+modeloDoVeiculo;
       }
    }
    
