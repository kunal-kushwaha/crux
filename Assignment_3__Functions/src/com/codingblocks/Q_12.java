package com.codingblocks;

public class Q_12 {

    public static void main(String[] args) {
        int result = lcm(4, 12);
        System.out.println(result);
    }

    public static int lcm(int a, int b){
        int hcf = Q_11.gcd(a, b);
        int l = a * b / hcf;
        return(l);
    }
}
