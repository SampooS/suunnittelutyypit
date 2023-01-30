package Teht2;

public class Koodaaja extends PukeutuvaOtus {
    private Vaate lippis;
    private Vaate paita;
    private Vaate housut;
    private Vaate kengat;

    public Koodaaja() {
        VaateTehdas omaBrandi = new VaateTehdas("Adidas");

        lippis = omaBrandi.luoVaate();
        paita = omaBrandi.luoVaate();
        housut = omaBrandi.luoVaate();
        kengat = omaBrandi.luoVaate();
    }

    public void reFit(VaateTehdas tehdas) {
        lippis = tehdas.luoVaate();
        paita = tehdas.luoVaate();
        housut = tehdas.luoVaate();
        kengat = tehdas.luoVaate();
    }

    public String toString() {
        return  "Lipppis: " + lippis + "\n" +
                "Paita: " + paita + "\n" +
                "Housut: " + housut + "\n" +
                "Kengät: " + kengat
                ; 
    
    }
}
