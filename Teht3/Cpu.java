package Teht3;

public class Cpu implements Komponentti {
    private double price;

    public Cpu(double hinta) {
        this.price = hinta;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    
}
