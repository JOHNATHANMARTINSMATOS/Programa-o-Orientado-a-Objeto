
package modelos;

abstract public class Produtos {

    // Atributos
    protected int codigo = 0;
    protected float preco = 0;

    //Metodos
    //Coonstrutor 01
    public Produtos() {
        this.codigo = 0;
        this.preco = 0;
    }

    //Construtor 02
    public Produtos(int codigo, float preco) throws Exception {
        if (codigo <= 0) {
            throw new Exception("Código Invalido!");
        }
        this.codigo = codigo;
        if (preco <= 0) {
            throw new Exception("Preço Invalido!");
        }
        this.preco = preco;
    }

    //Metodos get e set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws Exception {
        if (codigo <= 0) {
            throw new Exception("Código Invalido!");
        }
        this.codigo = codigo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) throws Exception {
        if (preco <= 0) {
            throw new Exception("Preço Invalido!");
        }
        this.preco = preco;
    }

    //Metodos abstratos
    abstract public String obterDescricaoCompletaDoproduto();

    abstract public float obterPrecoDeVendaDoProduto();

    abstract public String obterTipoDoProduto();
}
