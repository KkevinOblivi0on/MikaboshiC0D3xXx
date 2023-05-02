public class Tree {
    // Atributos de la clase Tree
    private String species;
    private int height;
    
    // Constructor de la clase Tree
    public Tree(String species, int height) {
        this.species = species;
        this.height = height;
    }
    
    // Métodos de la clase Tree
    public String getSpecies() {
        return species;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setSpecies(String species) {
        this.species = species;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
}
