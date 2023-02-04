package Teht3;

public class Mobo {
    
    private Cpu prossu;
    private Ram muisti;
    private Gpu nayttis;
    private NetCard netti;

    public Mobo(Cpu cpu, Ram rami, Gpu graphic, NetCard netscape) {
        this.prossu = cpu;
        this.muisti = rami;
        this.nayttis = graphic;
        this.netti = netscape;
    }

    
    public double calcPrice() {
        return prossu.getPrice()+muisti.getPrice()+nayttis.getPrice()+netti.getPrice();
    }
}
