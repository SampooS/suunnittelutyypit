package Teht11;

import java.util.Random;

public class GameMaster {
    private static Random rand = new Random();

    public static Card joinGame() {
        return new Card(rand.nextInt(100));
    }

    public static boolean correctGuess(Object card, int guess) {
        Card Handed = (Card) card;
        return Handed.getNum()==guess;
    }
}
