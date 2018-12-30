package com.codingblocks;

public class Q_2 {

    public static void main(String[] args) {
        deci2oct(23);
    }

    public static void deci2oct(int n){
        // 11 = 1011
        int oct = 0;
        int base = 1;
        while(n > 0){
            int rem = n % 8;
            n = n /8;
            oct = oct + base * rem;
            base = base * 10;
        }
        System.out.println(oct);
    }
}
