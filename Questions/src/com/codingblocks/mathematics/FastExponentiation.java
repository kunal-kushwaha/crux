package com.codingblocks.mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FastExponentiation {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(power(2,4));
    }

    public static int power(int x, int y) {
        if(y == 0) {
            return 1;
        }
        int smallerAns = power(x, y/2);
        smallerAns *= smallerAns;

        // check if power is odd
        int p = y&1;
        if(p == 1){
            smallerAns = smallerAns * x;
        }
        return smallerAns;
    }
}