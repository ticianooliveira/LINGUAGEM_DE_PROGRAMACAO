public class ContaCorrente extends ContaBancaria {
    private final double chequeEspecial;

    public ContaCorrente(String titular) {
        super(titular);
        this.chequeEspecial = 1000.00;
    }

    public void usarChequeEspecial() {
        System.out.println("Cheque especial de R$1000,00 disponível.");
    }

    @Override
    public void exibirDadosDaConta() {
        System.out.println("Titular: " + this.titular + ", Saldo: R$" + this.saldo + ", Cheque Especial: R$" + this.chequeEspecial);
    }
}
