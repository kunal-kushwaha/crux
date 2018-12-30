package com.codingblocks;

import java.util.Scanner;

public class Q_6 {

    // O(N^2)

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = new int[7];

        for (int i = 0; i < 7; i++) {
            nums[i] = input.nextInt();
        }

        int[] span = new int[7];

        for (int i = 0; i < 7; i++) {

            span[i] = 1;

            for (int j = i - 1; j >=0 && nums[j] <= nums[i] ; j--) {
                span[i]++;
            }
        }

        display(nums);
        display(span);
    }

    public static void display(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
