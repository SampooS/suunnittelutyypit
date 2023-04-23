public class HDD {
    String read(long location, int length) {
        System.out.println("HDD read " + length + " bytes from " + location);
        return "data";
    }
}
