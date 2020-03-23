package com.codingblocks.handy.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderClass {
    public static void main(String[] args) {
//        System.out.println("Enter some letters : ");
//        InputStreamReader isr = new InputStreamReader(System.in);
//
//        int letters = isr.read();
//
//        System.out.println(isr.ready()); // true
//        System.out.print("You entered: ");
//        while(isr.ready()) {
//            System.out.print((char) letters);
//            letters = isr.read();
//        }
//        System.out.println(isr.ready()); // false i.e. no more characters to be read
//
//        isr.close(); // Closes the stream and releases any system resources associated with it
//        System.out.println("\n---------");

        // proper way to do it, i.e. no throws clause needed

        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.print("Enter some letters: ");
            int letters = isr.read();
            System.out.print("You entered: ");
            while(isr.ready()) {
                System.out.print((char) letters);
                letters = isr.read();
            }
//             isr.close(); // try-with-resources automatically calls this so we don't have to worry about missing this step
            System.out.println("\n---------");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
