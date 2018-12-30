package com.codingblocks;

import java.util.*;
public class Q_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println(max(nums));
    }

    public static int max(int[] nums){
        int m = 0;
        for (int i = 1; i < nums.length ; i++) {
            if(nums[i] > nums[m])
                m = i;
        }
        return(nums[m]);
    }


}
