public class Filhos {
    private int qntFilhos;
    private int[] idades;

    public Filhos(int qntFilhos, int[] idades) {
        this.qntFilhos = qntFilhos;
        this.idades = idades;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Quantidade de Filhos: ").append(qntFilhos).append("\n");
        sb.append("Idades dos Filhos: ");
        for (int i = 0; i < qntFilhos; i++) {
            sb.append(idades[i]);
            if (i < qntFilhos - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
