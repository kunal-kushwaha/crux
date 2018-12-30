package com.codingblocks.patterns;

import java.util.Scanner;

public class VCut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            for(int s=1; s<2*(n-i);s++){
                System.out.print("  ");
            }
            for(int j=i; j>0; j--){
                if(j!=n){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
