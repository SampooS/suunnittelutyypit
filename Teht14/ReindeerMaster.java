package Teht14;

public class ReindeerMaster implements Chef {
    private ReindeerBurger reindeerBurger;

    public ReindeerMaster() {
        this.reindeerBurger = new ReindeerBurger();
    }

    @Override
    public void buildTopBun() {
        reindeerBurger.addIngredient(new Bun("Top bun"));
    }

    @Override
    public void buildToppings() {
        reindeerBurger.addIngredient(new Topping("Onion"));
        reindeerBurger.addIngredient(new Topping("Mushroom"));
        reindeerBurger.addIngredient(new Topping("Relish"));
    }

    @Override
    public void buildPatty() {
        reindeerBurger.addIngredient(new Patty("100% Reindeer patty"));
    }

    @Override
    public void buildBottomBun() {
        reindeerBurger.addIngredient(new Bun("Bottom bun"));
    }

    public Burger getBurger() {
        return this.reindeerBurger;
    }

}
