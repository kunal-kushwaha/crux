package com.codingblocks;

import java.util.Scanner;

public class Q_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        int M = input.nextInt();
        System.out.println(binaryS(nums, M));

    }

    public static int binaryS(int[] nums, int M){

        int first = 0;
        int last = nums.length - 1;

        while(first < last){

            int mid = (first + last) / 2;

            if(M == nums[mid])
                return mid;

            else if(M > nums[mid])
                first = mid + 1;

            else if(M < nums[mid])
                last = mid - 1;
        }
        return -1;
    }


}
