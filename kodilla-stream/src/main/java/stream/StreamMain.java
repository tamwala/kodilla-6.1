package stream;

import stream.beautifier.PoemBeautifier;
import stream.lambda.*;
import stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Kancelaria", (tekst -> tekst.concat("ABC")));
        poemBeautifier.beautify("Kancelaria", (tekst -> tekst.toUpperCase()));
        poemBeautifier.beautify("Kancelaria", (tekst -> tekst.repeat(3)));
        poemBeautifier.beautify("Kancelaria", (tekst -> tekst.substring(1)));

    }

}
