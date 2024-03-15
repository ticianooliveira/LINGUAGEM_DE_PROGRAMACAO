public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular) {
        super(titular);
    }

    public void calcularRendimento(double selic) {
        double rendimento;
        if (selic > 8.5) {
            rendimento = this.saldo * 0.005;
        } else {
            rendimento = this.saldo * 0.007 * selic;
        }
        System.out.println("Rendimento calculado: R$" + rendimento + ". Isso será adicionado ao seu saldo.");
    }

    @Override
    public void exibirDadosDaConta() {
        System.out.println("Titular: " + this.titular + ", Saldo: R$" + this.saldo);
    }
}
