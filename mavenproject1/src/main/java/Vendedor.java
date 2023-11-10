public class Vendedor extends Empregado {
    private double valorVendas;
    private int qntVendas;

    public Vendedor(String nome, int idade, char sexo, double salario, int matricula, double valorVendas, int qntVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }

    public String toString() {
        return super.toString() + ", Valor de Vendas: " + valorVendas + ", Quantidade de Vendas: " + qntVendas;
    }
}
