import java.util.Scanner;

public class Aluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno:");
        String nomeAluno = scanner.nextLine();

        System.out.println("Informe a nota da primeira prova:");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a nota da segunda prova:");
        double nota2 = scanner.nextDouble();

        System.out.println("Informe a nota do trabalho final:");
        double trabalhoFinal = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, trabalhoFinal);

        System.out.println("\nSituação acadêmica de " + nomeAluno + ":");
        if (media >= 70) {
            System.out.println("Aprovado! Média: " + media);
        } else if (media < 40) {
            System.out.println("Reprovado! Média: " + media);
        } else {
            System.out.println("Na final! Média: " + media);
        }

        scanner.close();
    }

    public static double calcularMedia(double nota1, double nota2, double trabalhoFinal) {
        return (nota1 + nota2 + trabalhoFinal) / 3;
    }
}
