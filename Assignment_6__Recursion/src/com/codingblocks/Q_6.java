package com.codingblocks;

public class Q_6 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,6,5};
        System.out.println(sorted(nums, 0));
    }

    public static boolean sorted(int[] nums, int index){

        if(index == nums.length-1)
            return true;

        return nums[index] <= nums[index+1] && sorted(nums, index + 1);
    }
}
