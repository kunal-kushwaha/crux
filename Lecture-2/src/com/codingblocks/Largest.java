package com.codingblocks;

public class Largest {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        int c = 15;
        int largest = 0;
        if (a > b){
            largest = a;
        } else{
            largest = b;
        }
        if (largest < c){
           largest = c;
        }
        System.out.println(largest + " is largest!");
    }
}
