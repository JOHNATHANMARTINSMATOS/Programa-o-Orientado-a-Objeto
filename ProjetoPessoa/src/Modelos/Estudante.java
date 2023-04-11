
package Modelos;

public class Estudante extends Pessoa{
    //Atributos
    protected int matricula;
    protected String curso;
    protected int campus;
    
    //Metodos
    
    //Construtor 01
    
    public Estudante(){
        super();
        this.matricula = 0;
        this.curso = " ";
        this.campus = 0;
    }
    
    //Construtor 02
    
    public Estudante(String nome, String endereco, int telefone, String email,int matricula,
            String curso, int campus)throws Exception{
        
        super(nome,endereco,telefone,email);
        if(matricula <= 0)throw  new Exception("Matricula Inválida!");
        this.matricula = matricula;
        this.curso = curso;
        if(campus<= 0)throw new Exception("Numero do campus inválido!");
        this.campus = campus;
        
    }
    
    //Metodos Get e Set

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula)throws Exception{
        if(matricula <= 0)throw  new Exception("Matricula Inválida!");
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCampus() {
        return campus;
    }

    public void setCampus(int campus)throws Exception{
        if(campus<= 0) throw new Exception("Numero do campus inválido!");
        this.campus = campus;
    }

    @Override
    public String toString() {
        return "Estudante{" + "Matricula: " + matricula + ", Curso: " + curso + ", Campus: " + campus + '}';
    }
    
    
}
