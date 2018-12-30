package com.codingblocks;

import java.util.Scanner;

public class Q_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        int[] data = inverse(nums);

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
    }

    public static int[] inverse(int[] nums){

        int[] data = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int value = nums[i];
            data[value] = i;

        }
        return data;
    }
}

