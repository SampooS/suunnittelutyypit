package Teht18;

import java.util.Scanner;
import Teht18.Kello;

public class Test {
    public static void main(String[] args) {
        Kello kello = new Kello();
        Scanner reader = new Scanner(System.in);
        String input = "";


        while (!input.toLowerCase().equals("quit")) {
            System.out.println(kello);
            System.out.println("Enter 'quit' to quit, or enter a number to tick that many minutes.");
            input = reader.nextLine();

            if (input.toLowerCase().equals("quit")) {
                break;
            }

            try {
                int x = Integer.parseInt(input);
                kello.tickX(x);
            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
        }

        Kello klooniKello = (Kello) kello.clone();
        Kello megaClone = (Kello) kello.cloneAlt();

        System.out.println("Kloonattu");

        System.out.println("klooni etenee 5");
        klooniKello.tickX(5);

        System.out.println("alkuperäinen etenee 15");
        kello.tickX(15);

        System.out.println("megaClone etenee 10");
        megaClone.tickX(10);

        System.out.println("Alkuperäinen: " + kello);

        System.out.println("Klooni: " + klooniKello);

        System.out.println("megaClone: " + megaClone);
        

        if (kello.equals(klooniKello)) {
            System.out.println("klooni ja kello ovat samat");
        } else {
            System.out.println("klooni ja kello ovat erilaiset");
        }

        if (kello.equals(megaClone)) {
            System.out.println("megaClone ja kello ovat samat");
        } else {
            System.out.println("megaClone ja kello ovat erilaiset");
        }

        reader.close();
    }
}
