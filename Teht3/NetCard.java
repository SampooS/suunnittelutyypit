package Teht3;

public class NetCard implements Komponentti {
    private double price;

    public NetCard(double hinta) {
        this.price = hinta;
    }

    @Override
    public double getPrice() {
        return this.price;
    }


}
