package com.codingblocks;

import java.util.Scanner;

public class Q_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println(palindrome(nums, 0, nums.length-1));

    }

    public static boolean palindrome(int[] nums, int first, int last){

        if(first == last || last - first == 1){
            return true;
        }

        return nums[first] == nums[last] && palindrome(nums, first+1, last-1);

    }
}
