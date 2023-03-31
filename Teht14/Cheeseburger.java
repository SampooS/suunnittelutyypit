package Teht14;

import java.util.ArrayList;

public class Cheeseburger extends Burger {
    ArrayList<Ingredient> parts;

    public Cheeseburger() {
        this.parts = new ArrayList<>();
    }

    public void addItem(Ingredient item) {
        parts.add(item);
    }

    public String toString() {
        String total = "";
        for (Ingredient ingredient : parts) {
            total += ingredient+"\n";
        }
        return total;
    }
}
