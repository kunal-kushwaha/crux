package com.codingblocks;

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        int result = any2any(1011, 10, 2);
        System.out.println(result);
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
