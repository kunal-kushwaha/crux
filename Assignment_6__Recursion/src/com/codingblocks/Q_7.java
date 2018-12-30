package com.codingblocks;

public class Q_7 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,6,5};
        System.out.println(find(nums, 0, 15));

    }

    public static boolean find(int[] nums, int index, int target){

        if(index == nums.length)
            return false;

        return nums[index] == target || find(nums, index+1, target);

    }
}
