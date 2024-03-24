package ex3;
public class Cliente {
    private String nome;
    private double saldo;
    private double limite;

    public Cliente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void sacar(double quantia) {
        if (saldo + limite >= quantia) {
            saldo -= quantia;
            System.out.println("Saque de R$" + quantia + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void depositar(double quantia) {
        saldo += quantia;
        System.out.println("Depósito de R$" + quantia + " realizado com sucesso.");
    }

    public double checarSaldo() {
        return saldo + limite;
    }

    public String obterNome() {
        return nome;
    }
}
