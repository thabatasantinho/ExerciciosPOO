package ex3;
/*ex 4 na lista: Implemente a classe Cliente que possua os atributos nome,
saldo, e limite. Esta deve possuir tamb´em os m´etodos sacar(), depositar(),
checarSaldo(), e obterNome(). Sabe-se que s´o ´e poss´ıvel sacar se o saldo+limite
forem superiores `a quantia. Os m´etodos sacar() e depositar() necessitam de
parˆametros. O m´etodo checarSaldo deve retornar o valor saldo+limite. O
m´etodo obterNome() deve retornar o nome do Cliente. */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 1000, 500);
        cliente.depositar(200);
        cliente.sacar(700);
        System.out.println(STR."Saldo disponível para \{cliente.obterNome()}: R$\{cliente.checarSaldo()}");
    }
}
