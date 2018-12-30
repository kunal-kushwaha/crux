package com.codingblocks;

import java.util.Scanner;

public class Q_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

    }

    public static void permutations(int[] processed, int[] unprocessed){

        if(unprocessed.length == 0){

            for (int i = 0; i < processed.length; i++) {
                System.out.print(processed[i] + " ");
            }
            return;
        }

    }

}
