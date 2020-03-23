package com.codingblocks.handy.io;

import java.io.IOException;

public class Read {
    public static void main(String[] args) throws IOException {

        // In the InputStream System.in, it basically keeps that input stream queued up until we press enter.
        // and the last input is the line feed (of ASCII value 10) when we press enter.

        // NOTE : It is important to note that the read() method is actually reading byte data in a primitive int data type,
        // I have just simply converted it to readable Unicode characters by casting it to type (char).
        // read() takes in byte data.

        // NOTE :
        // InputStream inputStream = System.in;
        // OR
        // InputStream inputStream = new FileInputStream(input);

        int letter = 0;
        letter = System.in.read();
        System.out.println("You typed : " + letter);
        System.out.println("You typed : " + (char)letter);
        while((letter = System.in.read()) != '\n'){
            System.out.println((char)letter);
        }

        // The above while statement will now let us type in another letter.
        System.out.println("Type another letter and press enter");
        letter = System.in.read();
        System.out.println("You typed : " + letter);
        System.out.println("You typed : " + (char)letter);
        while((letter = System.in.read()) != '\n'){
            System.out.println((char)letter);
        }

//        letter = System.in.read();
//        System.out.println("You typed : " + letter);
//        System.out.println("You typed : " + (char)letter);
//
//        letter = System.in.read();
//        System.out.println("You typed : " + letter);
//        System.out.println("You typed : " + (char)letter);
//
//        letter = System.in.read();
//        System.out.println("You typed : " + letter);
//        System.out.println("You typed : " + (char)letter);

        byte bArray[] = new byte[10];
        System.out.print("Type some letters and press Enter : ");
        System.in.read(bArray); // what we type will be stored in bArray (we can only input 10 characters i.e = size)
        System.out.println("You Typed : ");
        for (byte b : bArray){
            System.out.println((char)b + " " + b);
        }

    }
}
