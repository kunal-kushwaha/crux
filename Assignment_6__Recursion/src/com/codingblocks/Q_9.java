package com.codingblocks;

public class Q_9 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,6,5};

    }

    public static int findIndexLast(int[] nums, int index, int target){

        if(index == -1){
            return -1;

        }else if(nums[index] == target)
            return index;
        else
            return findIndexLast(nums, index-1, target);
    }

}
