package Teht14;

public class CheeseMaster implements Chef {
    private Cheeseburger cheeseBurger;

    public CheeseMaster() {
        this.cheeseBurger = new Cheeseburger();
    }
    @Override
    public void buildTopBun() {
        cheeseBurger.addItem(new Bun("Top bun"));
    }

    @Override
    public void buildToppings() {
        cheeseBurger.addItem(new Topping("Cheese"));
    }

    @Override
    public void buildPatty() {
        cheeseBurger.addItem(new Patty("100% Beef patty"));
    }

    @Override
    public void buildBottomBun() {
        cheeseBurger.addItem(new Bun("Bottom bun"));
    }

    public Burger getBurger() {
        return this.cheeseBurger;
    }
    
}
