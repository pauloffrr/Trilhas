package src;

public class ContaBanco {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;


    public ContaBanco(int numeroConta, String nomeCliente, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }

    public String getInfo() {
        return "Conta: " + numeroConta +
                "\nCliente: " + nomeCliente +
                "\nSaldo atual: R$ " + String.format("%.2f", saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Saque inválido. Verifique o saldo disponível.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {

        ContaBanco conta = new ContaBanco(12345, "João Silva", 500.00);
        System.out.println(conta.getInfo());

        conta.depositar(250.00);
        System.out.println("Saldo após depósito: R$ " + String.format("%.2f", conta.getSaldo()));

        conta.sacar(100.00);
        System.out.println("Saldo após saque: R$ " + String.format("%.2f", conta.getSaldo()));

        conta.sacar(700.00);
    }
}