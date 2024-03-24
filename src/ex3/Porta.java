package ex3;

public class Porta {
    private boolean isOpen;
    private static int numAberturas; // contador estático para o número total de aberturas

    // Construtor
    public Porta() {
        this.isOpen = false; // por padrão, a porta está fechada
    }

    // Método para abrir a porta
    public void abrir() {
        isOpen = true;
        numAberturas++; // incrementa o contador de aberturas
    }

    // Método para fechar a porta
    public void fechar() {
        isOpen = false;
    }

    // Método para verificar se a porta está aberta
    public boolean estaAberta() {
        return isOpen;
    }

    // Método estático para obter o número total de aberturas de todas as portas
    public static int getNumAberturas() {
        return numAberturas;
    }

    // Método estático para reiniciar o contador de aberturas
    public static void reiniciarContadorAberturas() {
        numAberturas = 0;
    }
}