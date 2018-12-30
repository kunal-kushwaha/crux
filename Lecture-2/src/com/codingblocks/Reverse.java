package com.codingblocks;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = 0;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;

            result = result * 10 + rem;
        }
        System.out.println("Result: " + result);
    }
}
