public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public double calcularBonus() {
        return salario * 0.10; // 10% do salário
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Departamento: " + departamento + ", Bônus: R$" + calcularBonus());
    }

    public void exibirGerente() {
    }
}
