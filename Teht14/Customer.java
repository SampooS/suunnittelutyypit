package Teht14;

public class Customer {
    Burger myBurger;

    public Customer() {}

    public void setBurger(Burger tasty) {
        this.myBurger = tasty;
    }

    public String printBurger() {
        return this.myBurger.toString();
    }
}
