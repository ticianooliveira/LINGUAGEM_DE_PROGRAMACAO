public class Smartphone extends Produto {
    public void ligacao(){
        System.out.println("Estou fazendo uma ligação");
    }

    public Smartphone(String nome, int estoque, int preco) {
        super(nome, estoque, preco);
    }
}
