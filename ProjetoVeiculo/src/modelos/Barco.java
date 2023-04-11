
package modelos;

public class Barco extends Veiculo implements IVeiculo{

    //Metodos
    public Barco() {
    }

    public Barco(String modeloDoVeiculo, boolean veiculoLigado) {
        super(modeloDoVeiculo, veiculoLigado);
    }

    
     @Override
    public String statusDoVeiculo(){
       if(veiculoLigado == true) return """
                                        ---Veiculo ligado---
                                        Tipo: Barco 
                                        Modelo: """+modeloDoVeiculo;
        return """
               ---Veiculo Desligado---
               Tipo: Barco 
               Modelo: """+modeloDoVeiculo;
    }
}
    
