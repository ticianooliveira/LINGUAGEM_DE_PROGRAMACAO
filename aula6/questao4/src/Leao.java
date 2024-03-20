public class Leao extends Animal {
    private String pelo;


    public Leao(String classe, String locomocao, String pelo) {
        super(classe, locomocao);
        this.pelo = pelo;
    }

    public void exibirInformacoes() {

        System.out.println("Classe: " + getClasse());
        System.out.println("Locomocao: " + getLocomocao());
        System.out.println("Pelo: " + pelo);
    }
}
