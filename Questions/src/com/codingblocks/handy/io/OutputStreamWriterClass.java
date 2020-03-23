package com.codingblocks.handy.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterClass {

    public static void main(String args[]) throws IOException {

        OutputStream os = System.out;
        os.write('ᛞ');  // will not show anything (or garbage) cuz range exceeded. ᛞ is Unicode.

        System.out.println();

        try (OutputStreamWriter OSW = new OutputStreamWriter(System.out)) {
            OSW.write("Hello World\n");
            OSW.write(97);
            OSW.write(98);
            OSW.write(99);
            OSW.write(49);
            OSW.write(50);
            OSW.write(51);
            OSW.write(10);  // newline
            OSW.write('A');
            OSW.write('B');
            OSW.write('C');
            OSW.write('1');
            OSW.write('2');
            OSW.write('3');
            OSW.write('\n');
            char cArray[] = "Hello World".toCharArray();
            OSW.write(cArray);
            OSW.write('\n');
            OSW.write('ᛞ');

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
