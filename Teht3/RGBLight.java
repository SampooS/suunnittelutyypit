package Teht3;

public class RGBLight implements Komponentti {
    private double price;

    public RGBLight(double hinta) {
        this.price = hinta;
    }

    public double getPrice() {
        return this.price;
    }
}
