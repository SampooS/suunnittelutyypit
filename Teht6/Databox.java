package Teht6;
import java.util.Scanner;

public class Databox implements Item {
    public Scanner lukija;

        public Databox() {
            this.lukija = new Scanner(System.in);
        }

        public String giveSecret() {
            return "My secret";
        }

        @Override
        public void act() {
            System.out.println(giveSecret());            
        }
}