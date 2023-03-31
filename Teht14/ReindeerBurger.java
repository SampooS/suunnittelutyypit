package Teht14;

public class ReindeerBurger extends Burger {
    StringBuilder strb;

    public ReindeerBurger() {
        this.strb = new StringBuilder();
    }

    public void addIngredient(Ingredient ing) {
        strb.append(ing+"\n");
    }

    public ReindeerBurger getBurger() {
        return this;
    }

    public String toString() {
        return strb.toString();
    }
}
