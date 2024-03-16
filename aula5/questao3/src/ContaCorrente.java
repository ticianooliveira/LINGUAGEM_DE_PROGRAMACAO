public class ContaCorrente extends ContaBancaria {
    private double chequeEspecial;

    public ContaCorrente(String titular) {
        super(titular);
        this.chequeEspecial = 1000.0;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + chequeEspecial) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Limite do cheque especial ultrapassado.");
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Cheque Especial: R$ " + chequeEspecial);
    }

    public void usarChequeEspecial(double valor) {
        if (valor <= saldo + chequeEspecial) {
            saldo -= valor;
            System.out.println("Utilizado cheque especial de R$ " + valor);
        } else {
            System.out.println("Limite do cheque especial ultrapassado.");
        }
    }
}
