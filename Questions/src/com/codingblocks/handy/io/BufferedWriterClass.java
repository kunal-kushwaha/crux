package com.codingblocks.handy.io;

import java.io.*;

public class BufferedWriterClass {

    public static void main(String args[]) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write("ᛞ Type whatever you want to go into a file called Sample.txt,");
            bw.newLine();
            bw.write("type EXIT on a new line and Enter to stop writing to the file: ");
            bw.newLine();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/SicParvisMagna/Google Drive/Documents/JAVA Programs/IntelliJ IDEA/CRUX/Handy/src/com/codingblocks/io/Example.txt"))) {
            bw.write("Hello BufferedWriter");
            bw.newLine();
            bw.write("Love the newLine() method :)");
            bw.newLine();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String inputString = br.readLine();
            while(!inputString.equals("EXIT")){

                try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/SicParvisMagna/Google Drive/Documents/JAVA Programs/IntelliJ IDEA/CRUX/Handy/src/com/codingblocks/io/Sample.txt", true))) {
                    bw.write(inputString);
                    bw.newLine();
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }

                inputString = br.readLine();

            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
