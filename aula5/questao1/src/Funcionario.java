class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}
