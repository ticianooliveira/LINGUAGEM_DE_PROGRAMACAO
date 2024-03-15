public class Aluno extends Pessoa{
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public Aluno(String nome, int idade, int matricula ){
        super(nome, idade);
        this.matricula=matricula;

    }
}
