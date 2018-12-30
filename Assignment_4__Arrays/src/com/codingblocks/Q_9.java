package com.codingblocks;

import java.util.Scanner;

public class Q_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        selection(nums);

        // display
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void selection(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - 1 - i;
            int m = max(nums, last);

            int temp = nums[last];
            nums[last] = nums[m];
            nums[m] = temp;
        }
    }

    public static int max(int[] nums, int last){
        int m = 0;

        for (int i = 1; i <= last ; i++) {
            if(nums[i] > nums[m])
                m = i;
        }

        return m;
    }
}
