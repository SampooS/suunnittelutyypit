package Teht13;

import Teht13.Character.State;

public class Visitor {
    public int bonus(State state) {
        switch (state) {
            case Busy:
                System.out.println("You missed a bonus!");
                return 0;
            case Receiving:
                System.out.println("Bonus received!");
                return 100;
            default:
                System.out.println("This shouldn't happen");
                return 0;
        }
    }
}
