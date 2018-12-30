package com.codingblocks;

public class Convertor {
    // psvm shotcut for public static void main(String[] args)
    public static void main(String[] args) {
        int deci = 31;
        while(deci > 0){
            int rem = deci % 2;
            deci = deci / 2;
            System.out.println(rem);
        }
    }
}
