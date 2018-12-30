package com.codingblocks;

import java.util.Scanner;

public class Q_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        reverse(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void reverse(int[] nums){

        for (int i = 0; i < nums.length / 2; i++) {

            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }

    }
}
