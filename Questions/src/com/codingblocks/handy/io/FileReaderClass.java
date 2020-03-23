package com.codingblocks.handy.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

    public static void main(String args[]) {
        try (FileReader fr = new FileReader("/Users/SicParvisMagna/Google Drive/Documents/JAVA Programs/IntelliJ IDEA/CRUX/Handy/src/com/codingblocks/io/Example.txt")) {
            int letters = fr.read();    // read() reads single character at a time
            while(fr.ready()) {
                System.out.print((char) letters);
                letters = fr.read();
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
