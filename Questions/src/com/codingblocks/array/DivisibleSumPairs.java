package com.codingblocks.array;

import java.util.LinkedList;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        int[] arr = {1,3,2,6,1,2};
        System.out.println(divisibleSumPairs(n, k, arr));
        System.out.println("a".compareTo("b"));
    }
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int[] freq = new int[k];
        for (int i = 0; i < ar.length; i++) {
            freq[ar[i]%k]++;
        }
        int sum = 0;
        sum += (freq[0] * (freq[0] - 1)) / 2;
        for (int i = 1; i <= k/2 && i != k - i; i++) {
            sum += freq[i] * freq[k-i];
        }
        if(k % 2 == 0) {
            sum += (freq[k/2] * (freq[k/2]-1))/2;
        }
        return sum;
    }

}
