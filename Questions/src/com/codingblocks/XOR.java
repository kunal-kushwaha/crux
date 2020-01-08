package com.codingblocks;

import java.util.Scanner;

public class XOR {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(ans(a,b));
        System.out.println(a == b);
    }
    public static int ans(int a, int b) {
        return fun(b) ^ fun(a-1);
    }


    // finds xor from 0 to n
    public static int fun(int n) {
        if(n % 4 == 0) {
            return n;
        }
        if(n % 4 == 1) {
            return 1;
        }
        if(n % 4 == 2) {
            return n+1;
        }
        else {
            return 0;
        }
    }
}
