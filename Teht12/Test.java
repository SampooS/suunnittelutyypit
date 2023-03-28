package Teht12;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    ArrayList<ImageProxy> list = new ArrayList<ImageProxy>();
    Scanner lukija = new Scanner(System.in);

    list.add(new ImageProxy("images/asdf1", "Funny cat"));
    list.add(new ImageProxy("images/asdf2", "very scary tiger"));
    list.add(new ImageProxy("images/asdf3", "Cool elephant"));
    list.add(new ImageProxy("images/asdf4", "nice doggy"));
    list.add(new ImageProxy("images/asdf5", "dangerous crocodile"));
    list.add(new ImageProxy("images/asdf6", "mysterious owl"));

    while (true) {

        for (Image image : list) {
            System.out.println(image.getClass() + ": " + image.showData());
        }

        System.out.println("\nwhich image to show?\ninput index\n");

        int input = lukija.nextInt();

        if (input < 0) { break; }

        if (input>=0 && input<list.size()) {

            System.out.println("what should we do?\n0 -> display image\n1 -> get name");

            switch (lukija.nextInt()) {
                case 0:
                    list.get(input).displayImage();
                    break;
                case 1:
                    System.out.println(list.get(input).showData());
                    break;
                default:
                    System.out.println("Bad input");
            }
        }
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }   
}
