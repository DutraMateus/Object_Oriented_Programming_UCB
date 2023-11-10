public class Pets {
    private int qntPets;
    private String[] tipoPet;

    public Pets(int qntPets, String[] tipoPet) {
        this.qntPets = qntPets;
        this.tipoPet = tipoPet;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Quantidade de Pets: ").append(qntPets).append("\n");
        sb.append("Tipos de Pets: ");
        for (int i = 0; i < qntPets; i++) {
            sb.append(tipoPet[i]);
            if (i < qntPets - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
