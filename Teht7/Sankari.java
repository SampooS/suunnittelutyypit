package Teht7;

import java.util.Random;

public class Sankari implements Hahmo {

    level state;

    public Sankari() {
        this.state = level.BEGINNER;
    }

    @Override
    public void fight() {
        switch (state) {
            case BEGINNER:
                System.out.println("The beginner hero lost his fight.");
                break;
            case EXPERIENCED:
                System.out.println("The experienced hero took down quite a few opponents before yielding.");
                break;
            case LEGENDARY:
                System.out.println("The legendary hero defeated the evil lord and rescued the princess!");
                break;
            default:
                System.out.println("Uh oh");
                break;
        }

        tryEvolve();

    }

    @Override
    public void camp() {
        switch (state) {
            case BEGINNER:
                System.out.println("The hero setup his camp in the woods but accidentally burnt his tent");
                break;
            case EXPERIENCED:
                System.out.println("The hero setup his camp in a cave and was ambushed by some goblins");
                break;
            case LEGENDARY:
                System.out.println("The hero setup his camp in a tree and slept soundly the whole night");
                break;
            default:
                System.out.println("Uh oh");
                break;

        }
        tryEvolve();
    }

    @Override
    public void haggle() {
        switch (state) {
            case BEGINNER:
                System.out.println("The hero offended the shopkeeper and was thrown out");
                break;
            case EXPERIENCED:
                System.out.println("The hero wasn't able to convince the shopkeeper and bought the item at set price");
                break;
            case LEGENDARY:
                System.out.println("The hero convinced the shopkeeper to give the item for free");
                break;
            default:
                break;
        
        }
        tryEvolve();
    }

    @Override
    public void tryEvolve() {
        Random rand = new Random();
        boolean evolves = rand.nextInt() % 5 == 0;

        if (evolves) {
            System.out.println("The hero gained some experience");
            this.state = state.advance();
        }
    }
}
