package Teht3;

public class Gpu implements Komponentti {
    private double price;
    
    public Gpu(double hinta) {
        this.price = hinta;
    }

    public double getPrice() {
        return price;
    }
    
}
