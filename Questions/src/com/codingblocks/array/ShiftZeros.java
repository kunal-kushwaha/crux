package com.codingblocks.array;

import java.util.Arrays;

public class ShiftZeros {
    public static void main(String[] args) {
        int[] arr = {1,2,9,0,0,4,0,0,6,5,3};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
