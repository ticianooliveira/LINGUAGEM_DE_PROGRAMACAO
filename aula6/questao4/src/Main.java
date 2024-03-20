public class Main {
    public static void main(String[] args) {

        Leao leao = new Leao("Mamífero", "Quadrúpede", "Juba");
        Arara arara = new Arara();

        System.out.println("Informações do Leao:");
        leao.exibirInformacoes();

        System.out.println("\nInformações da Arara:");
        System.out.println(arara.getClasse());
        System.out.println(arara.getLocomocao());
        System.out.println("Quantidade de ovos: " + arara.getQtdeOvos());
    }
}