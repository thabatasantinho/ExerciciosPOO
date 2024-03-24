import ex2.JogoAdivinhacao;

/* ex6 na lista: Implemente uma classe que modele um jogo de adivinhacao de
n´umeros de 0 a 99. Atributos: um numero inteiro sorteado. Metodos: sortear(),
advinhar(). OBS: O objeto para gerar n´umero aleatorios no Java e o Random;
voce deve instanci´a-lo e chamar seu m´etodo nextInt() que deve possuir um
        argumento inteiro, no caso aqui, 100.*/
public static void main(String[] args) {

    JogoAdivinhacao jogo = new JogoAdivinhacao();

    jogo.sortear();

    int palpite = 50;
    jogo.adivinhar(palpite);
}

