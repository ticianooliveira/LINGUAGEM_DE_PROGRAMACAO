class Diretor extends Funcionario {
    int acoes;

    public Diretor(String nome, double salario, int acoes) {
        super(nome, salario);
        this.acoes = acoes;
    }

    public void exibirDiretor() {
        super.exibir();
        System.out.println("Ações: " + acoes);
    }
}
