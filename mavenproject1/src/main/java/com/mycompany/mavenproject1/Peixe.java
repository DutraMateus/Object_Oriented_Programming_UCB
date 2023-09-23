public class Peixe extends Animal {
    private String tipoHabitat;

    public Peixe(String nome, double peso, String tipoHabitat) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public String toString() {
        return super.toString() + ", Tipo de Habitat: " + tipoHabitat;
    }
}
