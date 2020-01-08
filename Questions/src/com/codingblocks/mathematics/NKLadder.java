package com.codingblocks.mathematics;

import java.util.Scanner;

public class NKLadder {

    // There is a ladder of N steps, you have to reach the top.
    // You can only take jumps in 1,2,3,4,..,k
    // Find number of ways to reach the top

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        System.out.println(rec(n,m));
        System.out.println(iter(n,m));
    }
    
    public static int rec(int n, int m) {
        if(n < 2) {
            return n;
        }
        int ans = 0;
        for (int i = 1; i <= m && i <= n; i++) {
            ans += rec(n-i, m);
        }
        return ans;
    }

    public static int iter(int n, int m) {
        int[] ans = new int[n];
        ans[0] = 1;
        ans[1] = 1;
        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= m && j <= i; j++) {
                ans[i] += ans[i-j];
            }
        }
        return ans[n-1];
    }
}
