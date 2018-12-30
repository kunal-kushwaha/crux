package com.codingblocks;

import java.util.Scanner;

public class Q_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        int M = input.nextInt();

        System.out.println(find(nums, M));
    }

    public static int find(int[] nums, int M){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == M)
                return i;
        }
        return -1;
    }
}
