import java.util.Scanner;

public class FolhaPagamento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Folha de Pagamento - Indústria TICIANO LTDA");
        System.out.println("Informe o número de funcionários:");
        int numFuncionarios = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numFuncionarios; i++) {
            System.out.println("\nFuncionário #" + i);
            System.out.println("Informe a matrícula:");
            int matricula = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Informe o nome completo:");
            String nome = scanner.nextLine();
            System.out.println("Informe o salário bruto:");
            double salarioBruto = scanner.nextDouble();

            double inss = calcularINSS(salarioBruto);
            double salarioLiquido = salarioBruto - inss;

            System.out.println("\nContracheque:");
            System.out.println("Matrícula: " + matricula);
            System.out.println("Nome completo: " + nome);
            System.out.println("Salário Bruto: R$ " + salarioBruto);
            System.out.println("Dedução INSS: R$ " + inss);
            System.out.println("Salário Líquido: R$ " + salarioLiquido);
        }

        scanner.close();
    }

    public static double calcularINSS(double salarioBruto) {
        return salarioBruto * 0.15;
    }
}
