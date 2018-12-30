package com.codingblocks;

public class Q_15 {

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
