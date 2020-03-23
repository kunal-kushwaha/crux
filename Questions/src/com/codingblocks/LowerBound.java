package com.codingblocks;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int value = 35;
        System.out.println(lowerBound(arr, value));
    }
    public static int lowerBound(int[] array, int value) {
        int low = 0;
        int high = array.length;
        while (low < high) {
            final int mid = (low + high) / 2;
            //checks if the value is less than middle element of the array
            if (value <= array[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
