public class Produto {

    protected String nome;
    protected int estoque;
    protected int preco;

    public Produto(String nome, int estoque, int preco) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Estoque: " + estoque);
        System.out.println("Preço: " + preco);
    }
}
