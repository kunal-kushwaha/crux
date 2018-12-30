package com.codingblocks;

import java.util.Scanner;

public class Q_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        reverse(nums, 0, nums.length-1);

        for (int i = 0; i < N; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void reverse(int[] nums, int first, int last){

        if(first == last || first - last == 1){
            return;
        }

        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;

        reverse(nums, first+1, last-1);

    }
}
