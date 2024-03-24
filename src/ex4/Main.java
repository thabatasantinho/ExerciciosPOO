package ex4;

public class Main {
    public static void Main(String[] args) {
        Cliente cliente = new Cliente("João", 1000.0, 500.0);
        cliente.depositar(200.0);
        cliente.sacar(700.0);
        PrintStream var10000 = System.out;
        String var10001 = cliente.obterNome();
        var10000.println("Saldo disponível para " + var10001 + ": R$" + cliente.checarSaldo());
    }
}



