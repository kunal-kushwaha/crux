package com.codingblocks;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//
//        int deci = s.nextInt();
        int bin = s.nextInt();
        int any = s.nextInt();

        // base (any) = 2 for binary
        // base 2 means number will be represented in 0 and 1.
        // base 3 means number will be represented in 0 , 1 and 2,
        // because when divided by 3, rem can be 0, 1 or 2.

//        int bin = deci2any(deci, any);
//        System.out.println(bin);

        int deci = any2deci(bin, any);
        System.out.println(deci);
    }

    private static int deci2bin(int deci) {
        int bin = 0;
        int base = 1;
        while(deci > 0){
            int rem = deci % 2;
            deci = deci /2;
            bin = bin + rem*base;
            base = base * 10;
        }
        return bin;
    }

    private static int deci2any(int deci, int any) {
        int any_value = 0;
        int base = 1;
        while(deci > 0){
            int rem = deci % any;
            deci = deci / any;
            any_value = any_value + rem*base;
            base = base * 10;
        }
        return any_value;
    }

    private static int bin2deci(int bin){
        int deci = 0;
        int base = 1;

        while(bin > 0){
            int rem = bin % 10;
            deci = deci + rem*base;
            base = base * 2;
            bin = bin / 10;
        }
        return deci;
    }

    private static int any2deci(int bin, int any){
        int deci = 0;
        int base = 1;

        while(bin > 0){
            int rem = bin % 10;
            deci = deci + rem*base;
            base = base * any;
            bin = bin / 10;
        }
        return deci;
    }

    public static int any2any(int source, int dest, int value){

        int deci = any2deci(source, value);
        return deci2any(deci, dest);
    }

}

