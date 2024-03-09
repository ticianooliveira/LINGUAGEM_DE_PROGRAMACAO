public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Juliana", 5000, "TI");
        Diretor diretor = new Diretor("Marcos", 7000, 150);

        System.out.println("Informações do Gerente:");
        gerente.exibirGerente();

        System.out.println("\nInformações do Diretor:");
        diretor.exibirDiretor();
    }
}
