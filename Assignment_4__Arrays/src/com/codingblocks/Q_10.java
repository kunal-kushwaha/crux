package com.codingblocks;

import java.util.Scanner;

public class Q_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        insertion(nums);

        // display
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void insertion(int[] nums){

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i+1; j > 0; j--) {

                if(nums[j] < nums[j-1]){

                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
                else
                    break;
            }
        }
    }


}
