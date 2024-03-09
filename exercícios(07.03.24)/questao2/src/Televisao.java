public class Televisao extends Produto {
    public void acessarCanais(){
        System.out.println("Estou acessando canais");
    }

    public Televisao(String nome, int estoque, int preco) {
        super(nome, estoque, preco);
    }
}
