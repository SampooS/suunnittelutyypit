package Teht4;

public class Kello implements Observer {
    private Kvartsi quartz;

    public Kello(Kvartsi kvartsi) {
        this.quartz = kvartsi;
        quartz.attach(this);
    }

    @Override
    public void update(Observed muuttuja) {
        if (muuttuja == quartz) {
            draw();
        }
    }

    private void draw() {
        int hour = quartz.getHours();
        int minutes = quartz.getMinutes();

        System.out.printf("%-5s|%-5s", hour, minutes);
    }
    
}
