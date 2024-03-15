package Estoque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();


        System.out.println("Qual a quantidade Máxima do produto em estoque?");
        produto.setQuantidadeMaxima(sc.nextInt());

        System.out.println("Qual a quantidade Mínima do produto em estoque?");
        produto.setQuantidadeMinima(sc.nextInt());

        System.out.println("Qual a quantidade atual do produto em estoque? ");
        produto.setQuantidadeAtual(sc.nextInt());

        double quantidadeMedia = ((double) (produto.getQuantidadeMaxima() + produto.getQuantidadeMinima()) / 2);

        if (produto.getQuantidadeAtual() <=  quantidadeMedia ) {
            System.out.println("Efetue a compra.");
        }else {
            System.out.println("Não efetue a compra. ");
        }
    }
}