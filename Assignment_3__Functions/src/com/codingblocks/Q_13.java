package com.codingblocks;

public class Q_13 {
    public static void main(String[] args) {
        double result = power(4,9);
        System.out.println(result);
    }

    public static double power(int x, int n){

        int temp = x;

        for (int i = 1; i < n; i++) {
            temp = temp*x;
        }
        return temp;
    }
}
