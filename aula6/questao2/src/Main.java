
public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Camisa", 49.99, "Camisa polo azul");
        Produto produto2 = new Produto("Camisa", 99.99, "Calça jeans preta");

        
        System.out.println("Informações do Produto 1:");
        produto1.mostrarInformacoes();
        System.out.println();

        System.out.println("Informações do Produto 2:");
        produto2.mostrarInformacoes();
    }
}