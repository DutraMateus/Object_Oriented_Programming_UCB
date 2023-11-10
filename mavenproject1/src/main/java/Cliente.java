public class Cliente extends Pessoa {
    private double valorDivida;
    private int anoNascimento;

    public Cliente(String nome, int idade, char sexo, double valorDivida, int anoNascimento) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }

    public String toString() {
        return super.toString() + ", Valor da Dívida: " + valorDivida + ", Ano de Nascimento: " + anoNascimento;
    }
}

