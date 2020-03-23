package com.codingblocks.handy.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String args[]) {
        try (FileWriter fw = new FileWriter("/Users/SicParvisMagna/Google Drive/Documents/JAVA Programs/IntelliJ IDEA/CRUX/Handy/src/com/codingblocks/io/Example.txt")) {
            fw.write("First line of the text file.");
            fw.write(13);
            fw.write('\n');
            fw.write("Second line of the text file.");
            fw.write(13);
            fw.write('\n');
            fw.write("Third line of the text file.");
            fw.write(13);
            fw.write('\n');
            fw.write("Fourth line of the text file.");
            fw.write(13);
            fw.write('\n');
            fw.write("Fifth line of the text file.");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        //open the file in notepad and check it out. Let's write it again, it will get overwritten
        try (FileWriter fw = new FileWriter("/Users/SicParvisMagna/Google Drive/Documents/JAVA Programs/IntelliJ IDEA/CRUX/Handy/src/com/codingblocks/io/Example.txt")) {
            fw.write("First line of the text file.");
            fw.write(13);
            fw.write('\n');
            fw.write("Second line of the text file.");
            fw.write(13);
            fw.write('\n');
            fw.write("Third line of the text file.");
            fw.write(13);
            fw.write('\n');
            fw.write("Fourth line of the text file.");
            fw.write(13);
            fw.write('\n');
            fw.write("Fifth line of the text file.");
            fw.write(13);
            fw.write('\n');
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        //Let's use the constructor that will allow us to append to the file.
        try (FileWriter fw = new FileWriter("/Users/SicParvisMagna/Google Drive/Documents/JAVA Programs/IntelliJ IDEA/CRUX/Handy/src/com/codingblocks/io/Example.txt", true)) {
            fw.write("First line of the text file.");
            fw.write(13);
            fw.write('\n');
            fw.write("Second line of the text file.");
            fw.write(13);
            fw.write('\n');
            fw.write("Third line of the text file.");
            fw.write(13);
            fw.write('\n');
            fw.write("Fourth line of the text file.");
            fw.write(13);
            fw.write('\n');
            fw.write("Fifth line of the text file.");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        // create a file in another folder
        try (FileWriter fw = new FileWriter("/Users/SicParvisMagna/Google Drive/Documents/JAVA Programs/IntelliJ IDEA/CRUX/Handy/src/com/codingblocks/io/Sample.txt", true)) {
            fw.write("Hello FileWriter!");
            fw.write(13);
            fw.write('\n');
            fw.write("So easy to make files :)");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
