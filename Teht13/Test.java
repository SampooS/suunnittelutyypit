package Teht13;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Character winner = null;
        Random random = new Random();

        int playerCount = random.nextInt(2, 10);
        Character[] players = new Character[playerCount];

        Visitor santa = new Visitor();

        for (int i = 1; i <= playerCount ; i++) {
            players[i-1] = new Character("Player " + i);
            System.out.println("Player joined");
        }
        
        int round = 0;

        while (winner == null) {

            System.out.println("\nRound :" + ++round + "\n");
            
            for (Character character : players) {
                System.out.println(character);
            }

            for (Character character : players) {
                switch (random.nextInt(2)) {
                    case 0:
                        character.act();
                        if (character.getScore() >= 1000) { winner = character; }
                        break;
                    case 1:
                        character.rest();
                        break;
                    default:
                        System.out.println("Something went wrong");
                }
            }

            if (random.nextInt(5) == 0) {
                System.out.println("Bonus round!");
                for (Character character : players) {
                    character.accept(santa);
                    if (character.getScore() >= 1000) { winner = character; }
                }
            }

        }

        System.out.println("Winner: " + winner.getName() + " on round " + round);
    }
}
