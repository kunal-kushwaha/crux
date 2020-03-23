package com.codingblocks.bitmasking;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        subsets(arr);
    }
    public static void subsets(int[] arr) {
        for (int i = 0; i < (1 << arr.length); i++) {
            int msb = 0;
            int j = i;
            while(j > 0) {
                if ((j & 1) == 1){
                    System.out.print(arr[msb] +  " ");
                }
                msb++;
                j = j >> 1;
            }
            System.out.println();
        }
    }
}
