package Heranca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String repetir;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Deseja repetir? S/N");
            repetir = sc.next();
        }while (repetir.equalsIgnoreCase("S"));

    }
}