package com.codingblocks;

public class Q_17 {
    public static void main(String[] args) {
        int [][] nums = {
                {1,2,3,4},
                {11,12,13,4},
                {21,22,23,24},
                {31,32,33,34}
        };
    }
    public static void waveH(int[][] nums){
        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < nums[i].length ; j++) {
                    System.out.println(nums[i][j]);
                }
            }
            if(i % 2 != 0){
                for (int j = nums[i].length-1; j >= 0 ; j--) {
                    System.out.println(nums[i][j]);
                }
            }
        }
    }
}
