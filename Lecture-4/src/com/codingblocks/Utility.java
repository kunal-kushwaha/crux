package com.codingblocks;

public class Utility {

    public static void main(String[] args) {
        int[] data = {45, 4, 435, 56};
        display(data);
        System.out.println();
        swap(data, 0, 2 );
        System.out.println();
        display(data);
        System.out.println();
        int found = find(data,4);
        System.out.println(found);
        System.out.println();
        int n = max(data);
        System.out.println(data[n]);
    }

    public static void display_ln(int[] nums){
        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void display(int[] nums){
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] nums, int first, int second){

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static int find(int[] nums, int item){

        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] == item)
                return i;
        }
        return -1;
    }

    public static int max(int[] nums){
        int max = 0;

        for (int i = 0; i < nums.length ; i++){
            if(nums[i] > nums[max])
                max = i;
        }
        return max;
    }

    public static int max_limit(int[] nums, int start, int end){
        int max = start;

        for (int i = start; i <= end ; i++){
            if(nums[i] > nums[max])
                max = i;
        }
        return max;
    }
}
