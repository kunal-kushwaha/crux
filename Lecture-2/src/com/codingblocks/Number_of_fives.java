package com.codingblocks;

import java.util.Scanner;

public class Number_of_fives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        while(num>0){
            int rem = num % 10;
            num = num / 10;
            if(rem==5){
                count++;
            }
        }
        System.out.println("Number of fives: " + count);
    }
}
