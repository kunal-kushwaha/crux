package com.codingblocks.handy;

public class TimeTaken {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println("Hello World");
        long end = System.currentTimeMillis();

        System.out.println("Time taken (ms) : ");
        System.out.println(end - start);
    }

}
