public class StringInstrument extends Instrument {
    private int numStrings;
    
    public StringInstrument(boolean onSale, double price, int numInStock, int numStrings) {
        super(onSale, price, numInStock);
        this.numStrings = numStrings;
    }
    
    public int getNumStrings() {
        return numStrings;
    }
    
    public void setStrings(int numStrings) {
        this.numStrings = numStrings;
    }
}
