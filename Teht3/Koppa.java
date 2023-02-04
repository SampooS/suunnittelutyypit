package Teht3;

public class Koppa {

    private Mobo emo;
    private RGBLight gamerLights;
    
    public Koppa(Mobo mobo, RGBLight ledit) {
        this.emo = mobo;
        this.gamerLights = ledit;
    }


    public double calcPrice() {
        return emo.calcPrice()+gamerLights.getPrice();
    }
}
