package Teht18;

public class Minuuttiviisari implements Viisari, Cloneable {
    private int arvo;
    private int maxArvo;

    public Minuuttiviisari() {
        this.arvo = 0;
        this.maxArvo = 59;
    }

    public int getArvo() {
        return this.arvo;
    }

    public void tick() {
        this.arvo++;
        if (this.arvo > this.maxArvo) {
            this.arvo = 0;
        }
    }

    public void tickX(int x) {
        this.arvo += x;

        if (this.arvo > this.maxArvo) {
            this.arvo = arvo - (this.maxArvo+1);
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}