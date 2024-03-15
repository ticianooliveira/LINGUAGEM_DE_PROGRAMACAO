public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + this.saldo);
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public abstract void exibirDadosDaConta();
}
