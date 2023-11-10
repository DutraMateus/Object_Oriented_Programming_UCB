public class TesteAnimais {
    public static void main(String[] args) {
        
        Peixe peixe = new Peixe("Nemo", 0.5, "Água Salgada");
        Cachorro cachorro = new Cachorro("Rex", 10.0, "Labrador");

        
        System.out.println("Informações do Peixe:");
        System.out.println(peixe); // Saída desejada: Nome: Nemo, Peso: 0.5, Tipo de Habitat: Água Salgada

        System.out.println("\nInformações do Cachorro:");
        System.out.println(cachorro); // Saída desejada: Nome: Rex, Peso: 10.0, Raça: Labrador
    }
}
