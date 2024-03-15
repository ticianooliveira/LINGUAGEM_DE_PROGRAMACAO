public class Diretor extends Funcionario {
    private int acoes;

    public Diretor(String nome, double salario, int acoes) {
        super(nome, salario);
        this.acoes = acoes;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Ações: " + acoes);
    }

    public void exibirDiretor() {
    }
}
