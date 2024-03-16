class Gerente extends Funcionario {
    String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public double calcularBonus() {
        return 0.1 * salario;
    }

    public void exibirGerente() {
        super.exibir();
        System.out.println("Departamento: " + departamento);
    }
}
