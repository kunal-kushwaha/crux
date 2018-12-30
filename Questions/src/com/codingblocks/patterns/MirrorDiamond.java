package com.codingblocks.patterns;

import java.util.Scanner;

public class MirrorDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for(int i=1; i<=N; i++){
            for(int s=0; s<N-i;s++){
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
        for(int i=N-1; i>0; i--){
            for(int s=0; s<N-i;s++) {
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
