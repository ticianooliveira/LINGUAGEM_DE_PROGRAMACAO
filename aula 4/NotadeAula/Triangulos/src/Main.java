package Triangulos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String repetir;
        Scanner sc = new Scanner(System.in);

        do {
            triangulo triangulo = new triangulo();

            System.out.println("Digite o primeiro lado: ");
            triangulo.setLado1(sc.nextInt());

            System.out.println("Digite o segundo lado: ");
            triangulo.setLado2(sc.nextInt());

            System.out.println("Digite o terceiro lado: ");
            triangulo.setLado3(sc.nextInt());

            if (triangulo.getLado1() == triangulo.getLado2() && triangulo.getLado2() == triangulo.getLado3()){
                System.out.println("Seu triângulo é equilátero.");
            }
            else if (triangulo.getLado1() == triangulo.getLado2() || triangulo.getLado2() == triangulo.getLado3() || triangulo.getLado1() == triangulo.getLado3()){
                System.out.println("Seu triângulo é Isóceles.");
            } else {
                System.out.println("Seu triângulo é Escaleno.");
            }

            System.out.println("Deseja Cadastrar outro Triângulo? S/N");
            repetir = sc.next();
        }while (repetir.equalsIgnoreCase("S"));

    }
}