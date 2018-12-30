package com.codingblocks;

import java.util.Scanner;

public class Method_prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        boolean b = prime(num);
        System.out.println(b);
    }

    public static boolean prime(int num){
        int c = 2;
        while(c*c < num){
            if(num % c == 0){
                return false;
            }
            else{
                c++;
            }
        }
        return true;
    }
}
