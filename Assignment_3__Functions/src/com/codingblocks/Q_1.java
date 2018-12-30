package com.codingblocks;

public class Q_1 {

    public static void main(String[] args) {
        bin2deci(1011);
    }

    public static void bin2deci(int N){
        // 11 = 1011
        int base = 1;
        int deci = 0;
        while(N > 0){
            int rem = N % 10;
            N = N / 10;
            deci = rem * base + deci;
            base = base * 2;
        }
        System.out.println(deci);
    }
}
