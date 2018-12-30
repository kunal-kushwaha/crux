package com.codingblocks.patterns;

import java.util.Scanner;

public class FiboTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int i = 1;
        int p = 1;
        int temp = 0;
        System.out.printf("%4d", temp);
        System.out.println();
        System.out.printf("%4d", p);
        System.out.printf("%4d", i);

        System.out.println();
        for(int r=3; r<=N; r++){
            int count = 0;
            while(count < r){
                temp = p;
                p = p + i;
                i = temp;
                count++;
                System.out.printf("%4d", p);
            }
            System.out.println();
        }
    }
}
