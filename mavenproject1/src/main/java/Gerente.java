public class Gerente extends Empregado {
    private String nomeGerencia;

    public Gerente(String nome, int idade, char sexo, double salario, int matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public String toString() {
        return super.toString() + ", Gerência: " + nomeGerencia;
    }
}
