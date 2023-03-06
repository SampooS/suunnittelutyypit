package Teht9;

import java.util.Arrays;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
        "Marko",
        "Jorma",
        "Jonne",
        "Miro",
        "Gaabriel",
        "Ismo",
        "Jarno",
        "Olavi"
        );

        ListConverter everyConverter = new ListConverter(new NormalConverter());
        ListConverter oddConverter = new ListConverter(new OddListConverter());
        ListConverter thirdConverter = new ListConverter(new trioListConverter());

        System.out.println(everyConverter.listToString(list) + "\n"
        + oddConverter.listToString(list) + "\n"
        + thirdConverter.listToString(list));
    }
}
