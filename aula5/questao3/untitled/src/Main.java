package questao3.untitled.src;

import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema Bancário!");
        System.out.println("Digite 1 para Conta Corrente ou 2 para Conta Poupança:");
        int tipoConta = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.println("Digite o nome do titular da conta:");
        String titular = scanner.nextLine();

        ContaBancaria conta;

        if (tipoConta == 1) {
            conta = new ContaCorrente(titular);
        } else if (tipoConta == 2) {
            conta = new ContaPoupanca(titular);
        } else {
            System.out.println("Opção inválida.");
            scanner.close();
            return;
        }

        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha uma ação: 1-Depositar, 2-Sacar, 3-Especial/Poupança, 4-Exibir dados da conta, 5-Sair:");
            int acao = scanner.nextInt();

            switch (acao) {
                case 1: // Depositar
                    System.out.println("Informe o valor para depósito:");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2: // Sacar
                    System.out.println("Informe o valor para saque:");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3: // Especial / Poupança
                    if (conta instanceof ContaCorrente) {
                        ((ContaCorrente) conta).usarChequeEspecial();
                    } else if (conta instanceof ContaPoupanca) {
                        System.out.println("Informe a taxa Selic atual:");
                        double selic = scanner.nextDouble();
                        ((ContaPoupanca) conta).calcularRendimento(selic);
                    }