package ex1;

class Churrasco {
    double qtdCarne;

    public Churrasco() {
        this.qtdCarne = 0;
    }

    public void verificarConsumo(Pessoa pessoa) {
        double consumo = 0;
        if (pessoa.idade >= 4 && pessoa.idade <= 12 && !pessoa.vegetariana) {
            consumo = 1; // 1 kg para pessoas de 4 a 12 anos
        } else if (pessoa.idade >= 13 && !pessoa.vegetariana) {
            consumo = 2; // 2 kg para pessoas de 13 anos em diante
        }
        this.qtdCarne += consumo;
    }

    public double getQtdCarne() {
        return qtdCarne;
    }

    public void resetQtdCarne() {
        this.qtdCarne = 0;
    }
}