package pl.teslachorzow.apierwszyprogram;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class Main03 {
    public static void main(String[] args) {
        ChuckNorrisQuotes jokes = new ChuckNorrisQuotes();
        System.out.println("1. " + jokes.getRandomQuote());
        System.out.println("2. " + jokes.getRandomQuote());
        System.out.println("3. " + jokes.getRandomQuote());
    }
}
