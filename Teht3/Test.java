package Teht3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Cpu prossu = new Cpu(200);
        Gpu nayttis = new Gpu(700);
        NetCard netti = new NetCard(75);
        Ram muisti = new Ram(150);

        Mobo emo = new Mobo(prossu, muisti, nayttis, netti);
        RGBLight gamergamergamer = new RGBLight(50);

        Koppa kori = new Koppa(emo, gamergamergamer);

        System.out.printf("%.2f", kori.calcPrice());
    }
}
