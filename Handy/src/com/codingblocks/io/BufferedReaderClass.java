package com.codingblocks.io;

import java.io.*;

public class BufferedReaderClass {

    public static void main(String args[]) {

        // To read a character from a BufferedReader, use read().
        // Each time that read() is called, it reads a character from the input stream and returns it as an integer value.
        // It returns –1 when the end of the stream is encountered.

        System.out.print("Enter some text and press Enter: ");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("You typed: " + br.readLine());
            System.out.println("\n---------\n");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/SicParvisMagna/Google Drive/Documents/JAVA Programs/IntelliJ IDEA/CRUX/Handy/src/com/codingblocks/io/Example.txt"))) {
            System.out.println("The contents of Example.txt ...");
            while(br.ready()) {
                // To read a string from the keyboard, use the version of readLine() that is a member of the BufferedReader class.
                // It returns a String object.
                System.out.println(br.readLine());
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
