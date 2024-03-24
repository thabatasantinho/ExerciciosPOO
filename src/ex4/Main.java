package ex4;
/*Implemente a classe Cliente que possua os atributos nome,
saldo, e limite. Esta deve possuir tambem os m´etodos sacar(), depositar(),
checarSaldo(), e obterNome(). Sabe-se que so e possıvel sacar se o saldo+limite
forem superiores a quantia. Os metodos sacar() e depositar() necessitam de
parametros. O metodo checarSaldo deve retornar o valor saldo+limite. O
metodo obterNome() deve retornar o nome do Cliente.*/

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 1000, 500);
        cliente.depositar(200);
        cliente.sacar(700);
        System.out.println("Saldo disponível para " + cliente.obterNome() + ": R$" + cliente.checarSaldo());
    }
}



