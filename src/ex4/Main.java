package ex4;
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 1000, 500);
        cliente.depositar(200);
        cliente.sacar(700);
        System.out.println("Saldo disponível para " + cliente.obterNome() + ": R$" + cliente.checarSaldo());
    }
}



