package com.codingblocks;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums.length - i;
        }
        long start = System.currentTimeMillis();
//        quickSort(nums, 0, nums.length - 1);
        nums = mergeSort(nums);
        long end = System.currentTimeMillis();

        System.out.println(Arrays.toString(nums));
        System.out.println(end-start);
    }

    public static int[] mergeSort(int[] nums){
        if (nums.length == 1){
            return nums;
        }

        int mid = nums.length/2;

        int[] first = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] second = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(first, second);
    }

    private static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            // inc index at mix
            if (first[i] < second[j]){
                mix[k] = first[i]; // move smaller item to mix
                i++; // inc index of first
            } else {
                mix[k] = second[j]; // move smaller item to mix
                j++; // inc index of second
            }
            k++; // inc index at mix

        }

        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    public static void mergeSortInPlace(int[] nums, int start, int end){
        if (end - start == 1){
            return;
        }

        int mid = (start + end)/2;

        mergeSortInPlace(nums, start, mid);
        mergeSortInPlace(nums, mid, end);

        mergeInPlace(nums, start, mid, end);
    }

    private static void mergeInPlace(int[] nums, int start, int mid, int end) {
        int i = start;
        int j = mid;
        int k = 0;

        int[] mix = new int[end - start];

        while (i < mid && j < end){
            if (nums[i] < nums[j]){
                mix[k++] = nums[i++];
            } else {
                mix[k++] = nums[j++];
            }
        }

        while (i < mid){
            mix[k++] = nums[i++];
        }

        while (j < end){
            mix[k++] = nums[j++];
        }

        for (int l = 0; l < mix.length; l++) {
            nums[start + l] = mix[l];
        }
    }


    public static void quickSort(int[] nums, int low, int hi){
        if(low >= hi){
            return;
        }
        int left = low;
        int right = hi;
        int mid = (low + hi) / 2;
        int pivot = nums[mid];
        while(left <= right){
            while(nums[left] < pivot){
                left++;
            }
            while(nums[right] > pivot){
                right--;
            }
            if(left <= right){
                // swap
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        quickSort(nums, low, right);
        quickSort(nums, left, hi);
    }

}
