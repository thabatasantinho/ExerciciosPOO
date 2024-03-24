package ex1;
/*Exercicio 1. Dada a classe Pessoa que possui os atributos: String nome,
String sexo, int idade, boolean vegetariana. Fa¸ca agora uma classe Churrasco
que possua: Atributos: qtdCarne(double); M´etodo: verificarConsumo():
Recebe via parˆametro uma Pessoa e com isto define a consuma¸c˜ao m´edia de
carne (quantidade de carne consumida) pessoas de 0 a 3 anos n˜ao consomem,
vegetarianos tamb´em n˜ao. Pessoas de 4 a 12 anos consomem 1 kilo de carne e
de 13 anos em diante 2 kilos de carne.*/

public class Main {
    public static void main(String[] args) {

        // exercício da lista número 1

        Pessoa pessoa1 = new Pessoa("João", 8, false);
        Pessoa pessoa2 = new Pessoa("Maria", 25, true);
        Pessoa pessoa3 = new Pessoa("Pedro", 15, false);


        Churrasco churrasco = new Churrasco();

        churrasco.verificarConsumo(pessoa1);
        System.out.println("Quantidade de carne pessoa1: " + churrasco.getQtdCarne() + " kg");

        churrasco.resetQtdCarne();

        churrasco.verificarConsumo(pessoa2);
        System.out.println("Quantidade de carne pessoa2: " + churrasco.getQtdCarne() + " kg");

        churrasco.resetQtdCarne();

        churrasco.verificarConsumo(pessoa3);
        System.out.println("Quantidade de carne pessoa3: " + churrasco.getQtdCarne() + " kg");
    }
}