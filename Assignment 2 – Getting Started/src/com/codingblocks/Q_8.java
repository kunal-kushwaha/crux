package com.codingblocks;

import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        for (int i = 0; i < n ; i++) {
            for(int j=0; j<=i; j++){
                if(j ==0 || j == i){
                    System.out.print(i+1 + " ");
                }
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
