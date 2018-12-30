package com.codingblocks;

import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //n = rows
        int count = 1;
        for(int i = 0; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + "  ");
                count++;
            }
            System.out.println();
        }
    }
}
