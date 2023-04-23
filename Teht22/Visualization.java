package Teht22;

public class Visualization {
    public static void visualize(int height) {
        int visible = 10 - height;
        while (visible > 0) {
            System.out.println("# @@@@@@@@@@@@@@@@@@@@@@@@@@@@@ #");
            visible--;
        }
        System.out.println("# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ #");
        while (height > 1) {
            System.out.println("#                               #");
            height--;
        }

        System.out.println("#_______________________________#");

    }
}
