package ex3;
public class Main {
    public static void main(String[] args) {
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();

        // Exercício da lista número 8

        // Abrindo e fechando a porta1 algumas vezes
        porta1.abrir();
        porta1.fechar();
        porta1.abrir();
        porta1.fechar();

        // Abrindo a porta2 algumas vezes
        porta2.abrir();
        porta2.abrir();

        // Verificando o status das portas
        System.out.println("A porta1 está aberta? " + porta1.estaAberta());
        System.out.println("A porta2 está aberta? " + porta2.estaAberta());

        // Obtendo o número total de aberturas
        System.out.println("Número total de aberturas: " + Porta.getNumAberturas());

        // Reiniciando o contador de aberturas
        Porta.reiniciarContadorAberturas();
        System.out.println("Contador de aberturas reiniciado.");

        // Verificando o número total de aberturas após reiniciar
        System.out.println("Número total de aberturas após reiniciar: " + Porta.getNumAberturas());
    }
}