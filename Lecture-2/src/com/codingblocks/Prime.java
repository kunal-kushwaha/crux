package com.codingblocks;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = 2;
        if(n == 4){
            System.out.println("Not Prime");
        }else{
            while (c * c < n){
                if (n % c == 0){
                    System.out.println("Not Prime");
                    break;
                }
                c++;
            }
            if (c * c > n){
                System.out.println("Prime");
            }
        }
    }
}
