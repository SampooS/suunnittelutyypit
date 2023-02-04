package Teht4;

public class Kvartsi extends Observed {
    private int minutes;
    private int hours;

    public Kvartsi() {
        this.hours = 0;
        this.minutes = 0;
    }

    void tick() {
        minutes++;
        if (minutes >= 60 ){ minutes=0; hours++;}
        notify();
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getHours() {
        return this.hours;
    }
}
