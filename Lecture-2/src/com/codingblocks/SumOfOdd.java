package com.codingblocks;
import java.util.Scanner;
public class SumOfOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int odd_sum = 0;
        int even_sum = 0;

        while(num > 0){
            int rem = num % 10;
            num = num/10;
            even_sum = even_sum + rem;

            rem = num % 10;
            num = num/10;
            odd_sum = odd_sum + rem;

        }
        System.out.println("Even: " + even_sum);
        System.out.println("Odd: " + odd_sum);
    }
}
