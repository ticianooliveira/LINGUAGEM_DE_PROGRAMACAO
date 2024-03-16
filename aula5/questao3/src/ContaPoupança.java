public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }

    public void calcularRendimento(double selic) {
        double rendimento;
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * selic * saldo;
        }
        saldo += rendimento;
        System.out.println("Rendimento calculado: R$ " + rendimento);
    }
}
