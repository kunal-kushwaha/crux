package com.codingblocks.mathematics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://www.spoj.com/problems/SEQ/
public class SEQ {
    public static void main(String[] args) {
        int[] ar = {1,3,2,6,1,2};
        int k = 3;
        int[] arr = new int[ar.length];
        int count = 0;
        for(int i=0; i < ar.length; i++) {
            arr[i] = ar[i] % k;
        }

        System.out.println(Arrays.toString(arr));

        // find pair with sum = k
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];

        }
        System.out.println(count);
    }
}
