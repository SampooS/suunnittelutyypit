package Teht4;

import java.util.HashSet;

public class Observed {
    HashSet<Observer> observers = new HashSet();

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Object o) {
        observers.remove(o);
    }

    protected void scream() {
        for (Observer o : observers) {
            o.update(this);
        }
    }
}