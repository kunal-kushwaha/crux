package com.codingblocks;

public class Q_8 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,6,5};

    }

    private static int findIndex(int[] nums, int index, int target) {

        if(index == nums.length)
            return -1;
        else if(nums[index] == target){
            return index;
        }else{
            return findIndex(nums, index+1, target);
        }
    }


}
