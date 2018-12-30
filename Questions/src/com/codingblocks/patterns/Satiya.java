package com.codingblocks.patterns;

import java.util.Scanner;

public class Satiya {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if(N >= 5 && N % 2 !=0){
            for (int i = 0; i < N/2; i++) {
                System.out.print("*");

                for (int j = 0; j < N/2-1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if(i == 0){
                    for (int j = 0; j < N/2; j++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }

            for (int i = 0; i < N; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int i = 0; i < N/2; i++){

                if(i == N/2-1){
                    for (int j = 0; j < N/2 ; j++) {
                        System.out.print("*");
                    }
                }
                else{
                    for (int j = 0; j < N/2; j++) {
                        System.out.print(" ");
                    }
                }

                System.out.print("*");
                for (int j = 0; j < N/2-1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();

            }
        }
    }
}
