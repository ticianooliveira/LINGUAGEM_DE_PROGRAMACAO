
public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor("TicianoProf", 32, 5000.0);
        Aluno aluno = new Aluno("TicianoAlun", 20, 12345);

        professor.dadospessoa();
        System.out.println();
        aluno.dadospessoa();
    }
}