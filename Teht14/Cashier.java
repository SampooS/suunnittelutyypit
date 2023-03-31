package Teht14;

public class Cashier {

    Chef cheeseBurgerBuilder;
    Chef reindeerBuilder;

    public Cashier(Chef chef, Chef reindeerbuilder) {
        this.cheeseBurgerBuilder = chef;
        this.reindeerBuilder = reindeerbuilder;
    }

    public void orderCheeseBurger() {
        cheeseBurgerBuilder.buildTopBun();
        cheeseBurgerBuilder.buildToppings();
        cheeseBurgerBuilder.buildPatty();
        cheeseBurgerBuilder.buildBottomBun();
    }

    public void orderReindeerBurger() {
        reindeerBuilder.buildTopBun();
        reindeerBuilder.buildToppings();
        reindeerBuilder.buildPatty();
        reindeerBuilder.buildBottomBun();
    }
}
