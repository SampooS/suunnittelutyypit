package Teht1;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        AterioivaOtus raksamies = new Duunari();
        raksamies.aterioi();
        AterioivaOtus datanomi = new Opiskelija();
        datanomi.aterioi();
    }
}
