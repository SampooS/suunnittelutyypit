package Teht3;

public class Ram implements Komponentti {
    private double price;


    public Ram(double hinta) {
        this.price = hinta;
    }

    public double getPrice() {
        return this.price;
    }
    
}
