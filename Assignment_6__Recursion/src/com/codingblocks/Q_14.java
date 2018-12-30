package com.codingblocks;

public class Q_14 {

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
}
