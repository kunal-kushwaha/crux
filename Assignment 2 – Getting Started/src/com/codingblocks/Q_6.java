package com.codingblocks;

import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum_1 = 0;
        int sum_2 = 0;
        int count_1 = 0;
        int count_2 = 0;
        while(n > 0){
            int rem = n % 10;
            n = n/10;
            sum_1 = sum_1 + rem;
            if(n>0) {
                count_1++;
            }

            rem = n % 10;
            n = n/10;
            sum_2 = sum_2 + rem;
            if(n>0) {
                count_2++;
            }
        }
        System.out.println(count_1);
        System.out.println(count_2);

        if(count_1 > count_2){
            System.out.println("Odd: " + sum_2);
            System.out.println("Even: " + sum_1);
        }
        if(count_1 == count_2){
            System.out.println("Odd: " + sum_1);
            System.out.println("Even: " + sum_2);
        }

    }
}
