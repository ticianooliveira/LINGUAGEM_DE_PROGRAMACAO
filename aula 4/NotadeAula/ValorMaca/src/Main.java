package ValorMaca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String repetir;
        Scanner sc = new Scanner(System.in);

        double Valor1 = 1.30;
        double Valor2 = 1.0;


        do {
            Produto Produto = new Produto();

            System.out.println("Digite a quantidade de Maçãs que você deseja: ");
            Produto.setQuantidade(sc.nextInt());


            if (Produto.getQuantidade() < 12) {
                System.out.println(Produto.getQuantidade() * Valor1);
            }

            if (Produto.getQuantidade() >= 12){
                System.out.println(Produto.getQuantidade() * Valor2);
            }

            System.out.println("Deseja repetir? S/N");
            repetir = sc.next();
        }while (repetir.equalsIgnoreCase("S"));


    }
}