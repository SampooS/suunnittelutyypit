package Teht22;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Curtain curtain = new Curtain();

        LowerCurtainAction lowerCurtainAction = new LowerCurtainAction(curtain);
        LiftCurtainAction liftCurtainAction = new LiftCurtainAction(curtain);

        Button downButton = new Button(lowerCurtainAction);
        Button upButton = new Button(liftCurtainAction);

        while (true) {
            System.out.println("Press 1 to lower the curtain, 2 to lift it, 3 to exit");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input == 1) {
                downButton.press();
            } else if (input == 2) {
                upButton.press();
            } else if (input == 3) {
                break;
            }
            System.out.println("\n");
            Visualization.visualize(curtain.height);
        }
    }
}
