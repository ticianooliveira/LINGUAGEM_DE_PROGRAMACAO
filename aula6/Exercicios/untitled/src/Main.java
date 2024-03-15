public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("TicianoProf", 30, 20000);
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Idade: " + professor.getIdade());
        System.out.println("Salário: " + professor.getSalario());


        Aluno aluno = new Aluno("TicianoAlun", 30, 123456);
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}