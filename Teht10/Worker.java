package Teht10;

public abstract class Worker {

    private Worker superior;

    public void setSuperior(Worker sup) {
        this.superior = sup;
    }

    public void payRise(double percentage) {
        if (superior != null) {
            superior.payRise(percentage);
        }
    }
}
