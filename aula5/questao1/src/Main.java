import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Funcionários");
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();
        System.out.println("Digite o salário do funcionário:");
        double salario = Double.parseDouble(scanner.nextLine());

        System.out.println("Escolha o tipo de funcionário:");
        System.out.println("1 - Gerente");
        System.out.println("2 - Diretor");
        int tipo = Integer.parseInt(scanner.nextLine());

        if (tipo == 1) {
            System.out.println("Digite o departamento do gerente:");
            String departamento = scanner.nextLine();
            Gerente gerente = new Gerente(nome, salario, departamento);
            gerente.exibirGerente();
            System.out.println("Bônus: " + gerente.calcularBonus());
        } else if (tipo == 2) {
            System.out.println("Digite a quantidade de ações do diretor:");
            int acoes = Integer.parseInt(scanner.nextLine());
            Diretor diretor = new Diretor(nome, salario, acoes);
            diretor.exibirDiretor();
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
