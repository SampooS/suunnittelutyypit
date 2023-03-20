package Teht11;

import java.util.Random;

public class Player extends Thread {
    private Object card;
    Random rand;
    boolean keepRunning = true;
    int rounds = 0;
    int playerId;
    static int runningIds = 1;

    public Player(Object myCard) {
        this.rand = new Random();
        this.card = myCard;
        this.playerId=runningIds++;
    }

    public void guess() {
        if (GameMaster.correctGuess(card, rand.nextInt(100))) {
            System.out.println("Player " + this.playerId + " has won!");
            keepRunning = false;
        } else {
            System.out.println("Player " + this.playerId + " - Rounds: " + ++rounds);
        }
    }

    @Override
    public void run() {
        while(keepRunning) {
            guess();
             
        try {
            Thread.sleep(rand.nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } }
    }
}
