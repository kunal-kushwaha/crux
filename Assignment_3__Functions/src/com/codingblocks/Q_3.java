package com.codingblocks;

public class Q_3 {
    public static void main(String[] args) {
        int result = oct2bin(34);
        System.out.println(result);
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


    private static int oct2deci(int oct){
        int deci = 0;
        int base = 1;

        while(oct > 0){
            int rem = oct % 10;
            deci = deci + rem*base;
            base = base * 8;
            oct = oct / 10;
        }
        return deci;
    }

    public static int oct2bin(int oct){

        int deci = oct2deci(oct);
        return deci2bin(deci);
    }
}
