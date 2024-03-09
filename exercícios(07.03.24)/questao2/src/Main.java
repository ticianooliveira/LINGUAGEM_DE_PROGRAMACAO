
public class Main {
    public static void main(String[] args) {
        Televisao televisao = new Televisao("LG ", 5000, 3000);
        Smartphone smartphone = new Smartphone("Samsung", 7000, 1500);

        System.out.println("Informações dos Produtos");
        televisao.exibirInformacoes();
        smartphone.exibirInformacoes();
    }
}
