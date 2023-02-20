package Teht7;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Sankari hero = new Sankari();
        Scanner lukija = new Scanner(System.in);

        System.out.print("What does the hero do?\n1: fight\n2: camp\n3: haggle\ndecision: ");
        while (!hero.state.equals(level.LEGENDARY)) {
            int decision = lukija.nextInt();

            switch (decision) {
                case 1:
                    hero.fight();
                    break;
                case 2:
                    hero.camp();
                    break;
                case 3:
                    hero.haggle();
                    break;
                default:
                    System.out.println("Incorrect command");
                    break;
            }
        }

        System.out.println("After a long and succesful career adventuring the hero decided to retire in the countryside");
        lukija.close();
    }
    
}
