package com.codingblocks;

import java.util.*;

public class Array_Examples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }
    }

    public static boolean sorted(int[] nums, int index){

        if(index == nums.length-1){
            return true;
        }

        return nums[index] <= nums[index+1] && sorted(nums, index+1);
    }

    public static boolean find(int[] nums, int item, int index){
        if(index == nums.length)
            return false;

        return nums[index] == item || find(nums, item, index+1);
    }

    public static int findIndex(int[] nums, int item, int index){
        if(index == nums.length)
            return -1;

        if(nums[index] == item){
            return index;
        }
        else {
            return findIndex(nums, item, index+1);
        }
    }

    public static int findIndexLast(int[] nums, int item, int index){

        if(index == -1)     // so that it checks for 0th index
            return -1;

        if(nums[index] == item){
            return index;
        }
        else {
            return findIndexLast(nums, item, index-1);
        }
    }

    public static ArrayList findAllIndex(int[] nums, int item, int index, ArrayList indexs){
        if(index == nums.length)
            return indexs;

        if(nums[index] == item){
            indexs.add(index);
        }
        return findAllIndex(nums, item, index+1, indexs);
    }
}

