package com.codingblocks.patterns;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1; i<=n;i++){
            if(i<= n/2+1){
                for(int j=0; j < n-1-i; j++){
                    System.out.print("*");
                }
                for(int s=0; s<2*i-2; s++){
                    System.out.print(" ");
                }
                for(int j=0; j < n-1-i; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int k=0; k<i-2;k++){
                    System.out.print("*");
                }
                for(int s=0; s<2*(n-i);s++){
                    System.out.print(" ");
                }
                for(int k=0; k<i-2;k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
