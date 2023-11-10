<<<<<<< HEAD
public class Empregado extends Pessoa {
    private double salario;
    private int matricula;

    public Empregado(String nome, int idade, char sexo, double salario, int matricula) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public double valorInss() {
        return salario * 0.11;
    }
    
    public String toString() {
        return super.toString() + ", Salário: " + salario + ", Matrícula: " + matricula;
    }
}
=======
public class Empregado extends Pessoa {
    private double salario;
    private int matricula;

    public Empregado(String nome, int idade, char sexo, double salario, int matricula) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public double valorInss() {
        return salario * 0.11;
    }
    
    public String toString() {
        return super.toString() + ", Salário: " + salario + ", Matrícula: " + matricula;
    }
}
>>>>>>> a14e994ea74fb53e29bf8a75a9348768bbc68f33
