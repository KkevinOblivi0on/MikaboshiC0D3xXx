public class Instrument {
    private boolean onSale;
    private double price;
    private int numInStock;
    
    public Instrument(boolean onSale, double price, int numInStock) {
        this.onSale = onSale;
        this.price = price;
        this.numInStock = numInStock;
    }
    
    public double getPrice() {
        if (onSale) {
            return price * 0.85; // Aplica descuento del 15% si está en venta
        }
        return price;
    }
    
    public double applyEmployeeDiscount() {
        return price * 0.75; // Aplica descuento del 25% para empleados
    }
    
    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }
    
    public boolean getOnSale() {
        return onSale;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getNumInStock() {
        return numInStock;
    }
    
    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }
}
