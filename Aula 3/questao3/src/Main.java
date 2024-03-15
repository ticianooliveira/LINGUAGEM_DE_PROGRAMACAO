import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha a operação desejada:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            if (opcao != 0) {
                System.out.println("Informe os dois números:");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado da soma: " + soma(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado da subtração: " + subtracao(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado da multiplicação: " + multiplicacao(num1, num2));
                        break;
                    case 4:
                        System.out.println("Resultado da divisão: " + divisao(num1, num2));
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return Double.NaN; // Retorna um valor NaN (Not a Number) em caso de divisão por zero
        }
    }
}
