
package modelos;

public class Cd extends Produtos {

    //Atributos
    protected String nomeDoAlbum;
    protected String banda;
    protected String cantor;
    protected String genero;

    //Metodos
    //Construtor 01
    public Cd() {
        super();
        this.nomeDoAlbum = "";
        this.banda = "";
        this.cantor = "";
        this.genero = "";
    }

    //Construtor 02
    public Cd(String nomeDoAlbum, String banda, String cantor, String genero, int codigo, float preco) throws Exception {
        super(codigo, preco);
        this.nomeDoAlbum = nomeDoAlbum;
        this.banda = banda;
        this.cantor = cantor;
        this.genero = genero;
    }

    //Metodos get e set
    public String getNomeDoAlbum() {
        return nomeDoAlbum;
    }

    public void setNomeDoAlbum(String nomeDoAlbum) {
        this.nomeDoAlbum = nomeDoAlbum;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String obterDescricaoCompletaDoproduto() {
        return "Nome do Album: " + nomeDoAlbum + "\n"
                + "Banda: " + banda + "\n"
                + "Cantor: " + cantor + "\n"
                + "Genero: " + genero;
    }

    @Override
    public float obterPrecoDeVendaDoProduto() {
        return preco;
    }

    @Override
    public String obterTipoDoProduto() {
        return "Cd de Musicas";
    }

}
