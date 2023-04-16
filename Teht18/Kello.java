package Teht18;

public class Kello implements Cloneable {
    Tuntiviisari tunnit;
    Minuuttiviisari minuutit;

    public Kello() {
        this.tunnit = new Tuntiviisari();
        this.minuutit = new Minuuttiviisari();
    }

    public void tick() {
        this.minuutit.tick();
        if (this.minuutit.getArvo() == 0) {
            this.tunnit.tick();
        }
    }

    public void tickX(int x) {
        if (x > 0) {
            this.tick();
            this.tickX(x - 1);
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Object cloneAlt() {
        try {
            Kello klooni = (Kello) super.clone();
            klooni.tunnit = (Tuntiviisari) this.tunnit.clone();
            klooni.minuutit = (Minuuttiviisari) this.minuutit.clone();
            return klooni;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String toString() {
        return String.format("%02d:%02d", this.tunnit.getArvo(), this.minuutit.getArvo());
    }
}