package com.codingblocks.array;

import java.util.*;

public class MigratingBirdsHR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int arr_i=0; arr_i < n; arr_i++){
            arr.add(sc.nextInt());
        }
        System.out.println(ans(arr));
    }
    public static int ans(List<Integer> arr) {
        int[] freq = new int[6]; //A
        for (int i = 0; i < arr.size(); i++) { //B
            freq[arr.get(i)] += 1; //C
        }
        int mostCommon = 0;
        for (int i = 1; i < freq.length; i++) { //D
            if (freq[mostCommon] < freq[i]) {
                mostCommon = i; //E
            }
        }
        return mostCommon;
    }
}
