package Teht13;

public class Character {

    public enum State {
        Receiving,
        Busy
    }

    State state;
    private String name;
    private int score;

    public Character(String name) {
        this.state = State.Receiving;
        this.name = name;
        this.score = 0;
    }

    public void act() {
        this.state = State.Busy;
        score += 20;
    }

    public void rest() {
        this.state = State.Receiving;
    }

    public void accept(Visitor santa) {
        score += santa.bonus(state);
    }

    public int getScore() {
        return this.score;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return String.format("%-20s%-20s", this.name, this.score);
    }


}
