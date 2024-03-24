package ex2;

import java.util.Random;

public class JogoAdivinhacao {
    private int numeroSorteado;

    // Método para sortear um número aleatório entre 0 e 99
    public void sortear() {
        Random random = new Random();
        this.numeroSorteado = random.nextInt(100);
        System.out.println(STR."Número sorteado: \{this.numeroSorteado}");
    }

    // Método para adivinhar o número sorteado
    public void adivinhar(int numero) {
        if (numero == this.numeroSorteado) {
            System.out.println(STR."Parabéns! Você adivinhou o número corretamente: \{this.numeroSorteado}");
        } else {
            System.out.println(STR."Você errou! O número sorteado era: \{this.numeroSorteado}");
        }
    }
}

