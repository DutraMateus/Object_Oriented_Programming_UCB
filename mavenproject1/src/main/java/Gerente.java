<<<<<<< HEAD
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
=======
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
>>>>>>> a14e994ea74fb53e29bf8a75a9348768bbc68f33
