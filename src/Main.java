public class Main {
    public static void main(String[] args) {
        // Criando algumas pessoas para o churrasco
        Pessoa pessoa1 = new Pessoa("João", 8, false);
        Pessoa pessoa2 = new Pessoa("Maria", 25, true);
        Pessoa pessoa3 = new Pessoa("Pedro", 15, false);

        // Inicializando o churrasco
        Churrasco churrasco = new Churrasco();

        // Verificando o consumo de carne para cada pessoa
        churrasco.verificarConsumo(pessoa1);
        System.out.println("Quantidade de carne pessoa1: " + churrasco.getQtdCarne() + " kg");

        churrasco.resetQtdCarne(); // Resetando a quantidade de carne para verificar a próxima pessoa

        churrasco.verificarConsumo(pessoa2);
        System.out.println("Quantidade de carne pessoa2: " + churrasco.getQtdCarne() + " kg");

        churrasco.resetQtdCarne(); // Resetando a quantidade de carne para verificar a próxima pessoa

        churrasco.verificarConsumo(pessoa3);
        System.out.println("Quantidade de carne pessoa3: " + churrasco.getQtdCarne() + " kg");
    }
}