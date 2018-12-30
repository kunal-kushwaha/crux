package com.codingblocks;

public class Q_12 {

    public static void main(String[] args) {

    }

    public static void pair(int[] nums, int sum){
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == sum){
                    System.out.println(nums[i] + "  " + nums[j]);
                }
            }
        }
    }
}
