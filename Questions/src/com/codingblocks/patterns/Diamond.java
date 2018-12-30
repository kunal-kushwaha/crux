package com.codingblocks.patterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0; i<=n/2; i++){
            for(int s=0; s<n/2-i;s++){
                System.out.print("  ");
            }
            for(int j=1; j<=i*2+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n/2-1; i>=0; i--){

            for(int s=0; s<n/2-i;s++){
                System.out.print("  ");
            }
            for(int j=0; j<i*2+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
