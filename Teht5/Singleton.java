package Teht5;

import javax.print.attribute.standard.RequestingUserName;

public class Singleton {
// Tässä esimerkkinä tapahtuman kävijämäärää laskeva singletoni
    private int ticker;
    private static Singleton INSTANCE = null;

    private void Singleton() {
        this.ticker = 0;
    }

    public Singleton getInstance() {
        if (INSTANCE==null) { INSTANCE = new Singleton(); } 
        return INSTANCE;
    }

    public void tick() {
        this.ticker++;
    }

    public int check() {
        return this.ticker;
    }
}
