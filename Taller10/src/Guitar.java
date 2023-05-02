public class Guitar extends StringInstrument {
    private boolean isElectric;
    
    public Guitar(boolean onSale, double price, int numInStock, int numStrings, boolean isElectric) {
        super(onSale, price, numInStock, numStrings);
        this.isElectric = isElectric;
    }
    
    public boolean getIsElectric() {
        return isElectric;
    }
}
