package com.codingblocks.handy;

public class Datatypes {

    public static void main(String[] args) {

        byte b = (byte)128;
        System.out.println(b);  // -128
        // because it will only take the last 8 bits of the binary representation of 128
        // which are 10000000 which is -128.

        short sh = 32000;   // implicit conversion takes place for byte and short

        System.out.println(10 + 20 + "Hello" + 10 + 20);
        System.out.println(2 + ' ' + 5);    // here it will take the ascii of ' '
        System.out.println(2 + " " + 5);
        System.out.println("Hello" + '\t' + "World"); // String + char + string = string + string = string
        System.out.println("Hello" + "\t" + "World");
    }

}
