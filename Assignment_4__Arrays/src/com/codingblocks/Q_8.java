package com.codingblocks;

import java.util.Scanner;

public class Q_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        bubble(nums);
    }

    public static void bubble(int[] nums){


        for (int i = 0; i < nums.length; i++) {

            for (int j = 1; j < nums.length - i; j++) {

                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }


}
