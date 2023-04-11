
package Modelos;

public class Graduado extends Estudante {

    //Atributos
    protected int anoDaConclusao = 0;
    protected int anoDaColacaoDeGrau = 0;
    protected int numeroDoDiploma = 0;

    //Metodos
    //Construtor 01
    public Graduado() {
        super();
        this.anoDaConclusao = 0;
        this.anoDaColacaoDeGrau = 0;
        this.numeroDoDiploma = 0;
    }

    //Construtor 02
    public Graduado(String nome, String endereco, int telefone, String email, int matricula,
            String curso, int campus, int anoDaConclusao, int anoDaColacaoDeGrau, int numeroDoDiploma) throws Exception {

        super(nome, endereco, telefone, email, matricula, curso, campus);

        if (anoDaConclusao <= 0) {
            throw new Exception("Ano de Conclusão Inválido!");
        }
        this.anoDaConclusao = anoDaConclusao;

        if (anoDaColacaoDeGrau <= 0) {
            throw new Exception("Ano da colação de Grau Inválido!");
        }
        this.anoDaColacaoDeGrau = anoDaColacaoDeGrau;

        if (numeroDoDiploma <= 0) {
            throw new Exception("Numéro do Diploma Inválido!");
        }
        this.numeroDoDiploma = numeroDoDiploma;
    }

    //Metodos Get e Set
    public int getAnoDaConclusao() {
        return anoDaConclusao;
    }

    public void setAnoDaConclusao(int anoDaConclusao) throws Exception {
        if (anoDaConclusao <= 0) {
            throw new Exception("Ano de Conclusão Inválido!");
        }
        this.anoDaConclusao = anoDaConclusao;
    }

    public int getAnoDaColacaoDeGrau() {
        return anoDaColacaoDeGrau;
    }

    public void setAnoDaColacaoDeGrau(int anoDaColacaoDeGrau) throws Exception {
        if (anoDaColacaoDeGrau <= 0) {
            throw new Exception("Ano da colação de Grau Inválido!");
        }
        this.anoDaColacaoDeGrau = anoDaColacaoDeGrau;
    }

    public int getNumeroDoDiploma() {
        return numeroDoDiploma;
    }

    public void setNumeroDoDiploma(int numeroDoDiploma) throws Exception {
        if (numeroDoDiploma <= 0) {
            throw new Exception("Numéro do Diploma Inválido!");
        }
        this.numeroDoDiploma = numeroDoDiploma;
    }

    @Override
    public String toString() {
        return "Graduado{" + "Ano da Conclusão: " + anoDaConclusao
                + ", Ano da colação de Grau: " + anoDaColacaoDeGrau + ", Numéro do Diploma: " + numeroDoDiploma + '}';
    }

}
