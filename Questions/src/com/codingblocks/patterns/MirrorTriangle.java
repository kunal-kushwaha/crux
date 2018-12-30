package com.codingblocks.patterns;

import java.util.Scanner;

public class MirrorTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1; i<=n; i++){
            for(int s=0; s<n-i;s++){
                System.out.print("  ");
            }
            for(int j=i; j< i*2; j++){
                System.out.print(j + " ");
            }
            for(int k=i*2-2; k>=i; k--){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
