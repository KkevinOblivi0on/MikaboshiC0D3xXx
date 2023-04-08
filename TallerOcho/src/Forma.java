public class Forma {
    private int numSides;
    private boolean regular;

    // Constructor con parámetros
    public Forma(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    // Constructor
    public Forma() {
        this.numSides = 0;
        this.regular = false;
    }

    // Métodos captadores y estlablecedores para numSides
    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    // captadores y establecedores para el regular
    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }
}
