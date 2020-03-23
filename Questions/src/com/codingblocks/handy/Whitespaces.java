package com.codingblocks.handy;

public class Whitespaces {
    public static void main(String[] args) {
        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }
}

/*
OUTPUT :

Original sentence: T    his is b  ett     er.
After replacement: Thisisbetter.

*/
