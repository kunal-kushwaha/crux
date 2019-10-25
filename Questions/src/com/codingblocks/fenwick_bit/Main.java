package com.codingblocks.fenwick_bit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] bit = new int[n+1];
        int[] a = new int[n+1];
        // build the bit : O(NLogN)
        for (int i = 1; i <= n; i++) {
            a[i] = s.nextInt();
            update(i, a[i], n, bit);
        }

        System.out.println(Arrays.toString(bit));

//        System.out.println(query(3, bit));

        // count inversions : Note - to make sure that array only has elements from 1 to n,
        // assign numbers from 1 to n based on their increasing order if the elements are large
        // This is called Coordinate Compression
//        int[] arr = new int[n+1];
//        for (int i = 1; i <= n; i++) {
//            arr[i] = s.nextInt();
//        }
//        convert(arr, n);
//        int ans = 0;
//        for (int i = n; i >= 1; i--) {
//            ans += query(arr[i]-1, bit);
//            update(arr[i], 1, n, bit);
//        }
//        System.out.println(ans);
    }

    // O(LogN)
    private static void update(int i, int value, int n, int[] bit) {
        while(i <= n) {
            bit[i] += value;
            i += (i & (-i));
        }
//        System.out.println(Arrays.toString(bit));
    }

    // O(LogN) : Range max Query
    private static void updateMax(int i, int value, int n, int[] bit) {
        while(i <= n) {
            bit[i] = Math.max(bit[i], value);
            i += (i & (-i));
        }
    }

    // sum till ith index : O(LogN)
    public static int query(int i, int[] bit) {
        int sum = 0;
        while(i > 0) {
            sum += bit[i];
            i -= (i & (-i));
        }
//        System.out.println(sum);
        return sum;
    }

    // coordinate compression
    public static void convert(int arr[], int n) {
        // Create a temp array and copy contents
        // of arr[] to temp
        int temp[] = arr.clone();

        // Sort temp array
        Arrays.sort(temp);

        // Create a hash table.
        HashMap<Integer, Integer> umap = new HashMap<>();

        // One by one insert elements of sorted
        // temp[] and assign them values from 0
        // to n-1
        int val = 1;
        for (int i = 0; i <= n; i++) {
            umap.put(temp[i], val++);
        }

        // Convert array by taking positions from
        // umap
        for (int i = 1; i <= n; i++) {
            arr[i] = umap.get(arr[i]);
        }
    }
}
