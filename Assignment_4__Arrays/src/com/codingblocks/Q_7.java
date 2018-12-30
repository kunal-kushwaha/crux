package com.codingblocks;

import java.util.*;

public class Q_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        int[] nums2 = new int[N];

        for (int i = 0; i < N; i++) {
            nums2[i] = input.nextInt();
        }

        System.out.println(inverse(nums, nums2));
    }

    public static boolean inverse(int[] nums, int[] nums2) {

        int[] data = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int value = nums[i];
            data[value] = i;

        }

        if (Arrays.equals(data, nums2))
            return true;
        return false;
    }

}
