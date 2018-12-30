package com.codingblocks;

import java.util.Arrays;

public class Pattern {
    public static void main(String[] args) {

        int n = 5;
        triangle(n, 0);
        int[] nums = {5,3,4,2,6};
        bubble(nums,nums.length-1,0);
        System.out.println(Arrays.toString(nums));
        int[] nums2 = {5,2,7,4,1,9,3};
        selection(nums2, nums2.length, 0 , 0);
        System.out.println(Arrays.toString(nums2));

    }

    public static void triangle(int row, int col){

        if(row == 0)
            return;

        if(col < row){
            System.out.print("*");
            triangle(row, col + 1);
//            System.out.print("*");  // for normal triangle

        }else{
            System.out.println();
            triangle(row - 1, 0);
//            System.out.print("*");  // for normal triangle

        }
    }

    public static void bubble(int[] nums, int row, int col){

        if(row == 0)
            return;

        if(col < row){
            if(nums[col] > nums[col+1]){
                int t = nums[col+1];
                nums[col+1] = nums[col];
                nums[col] = t;
            }

            bubble(nums, row, col + 1);

        }else{
            System.out.println();
            bubble(nums, row - 1, 0);
        }
    }

    public static void selection(int[] nums, int row, int col, int max){

        if(row == 0)
            return;

        if(col < row){
            if(nums[col] > nums[max]){
                selection(nums, row, col + 1, col);
            }else{
                selection(nums, row, col + 1, max);

            }

        }else{

            int t = nums[row-1];
            nums[row-1] = nums[max];
            nums[max] = t;

            selection(nums, row-1, 0,0);
        }
    }
}
