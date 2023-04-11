
package modelos;

public class Livro extends Produtos {

    //Atributos
    protected String titulo;
    protected String autor;
    protected String tradutor;
    protected String editora;
    protected int anoDePublicacao;

    //metodos
    //Construtor 01
    public Livro() {
        super();
        this.titulo = "";
        this.autor = "";
        this.tradutor = "";
        this.editora = "";
        this.anoDePublicacao = 0;
    }

    //construtor 02
    public Livro(int codigo, float preco, String titulo, String autor,
            String tradutor, String editora, int anoDePublicacao) throws Exception {
        super(codigo, preco);
        this.titulo = titulo;
        this.autor = autor;
        this.tradutor = tradutor;
        this.editora = editora;
        if (anoDePublicacao <= 0) {
            throw new Exception("Ano de Publicação Invalido!");
        }
        this.anoDePublicacao = anoDePublicacao;
    }

    // Metodos get e set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTradutor() {
        return tradutor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) throws Exception {
        if (anoDePublicacao <= 0) {
            throw new Exception("Ano de Publicação Inválido!");
        }
        this.anoDePublicacao = anoDePublicacao;
    }

    @Override
    public String obterDescricaoCompletaDoproduto() {
        return "Titulo: " + titulo + "\n"
                + "Autor: " + autor + "\n"
                + "Tradutor: " + tradutor + "\n"
                + "editora: " + editora + "\n"
                + "Ano da Publicação: " + anoDePublicacao;
    }

    @Override
    public float obterPrecoDeVendaDoProduto() {
        return preco;
    }

    @Override
    public String obterTipoDoProduto() {
        return "Livro";
    }
}
