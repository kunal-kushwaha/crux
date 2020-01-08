package com.codingblocks;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int c = s.nextInt();
        System.out.println(binarySearch(arr, c));
    }

    public static int binarySearch(int[] arr, int c) {
        int low = 0;
        int hi = arr[arr.length - 1];
        int max = -1;
        while(low <= hi) {
            int mid = (low + hi) / 2;
            // check if mid distance is okay
            if(check(arr, c, mid)) {
                // check in right
                if(mid > max) {
                    max = mid;
                }
                low = mid + 1;
            } else {
                // check in left
                hi = mid - 1;
            }
        }
        return max;
    }
    public static boolean check(int[] arr, int c, int num) {
        int pos = arr[0];
        c--; // cow placed at first
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-pos >= num) {
                // place the cow
                c--;
                if(c == 0) {
                    return true;
                }
                pos = arr[i];
            }
        }
        return false;
    }

    public static int nk(int n, int m) {
        if(n < 2) {
           return n;
        }
        int ans = 0;
        for (int i = 1; i <= m && i <= n; i++) {
            ans += nk(n-i, m);
        }
        return ans;
    }

    // steps = 1,2,3,4,5,6,7... m : m <= n
//    steps(n) += steps(n-1) + steps(n-2) + steps(n-3) + steps(n-4) + ...

    public static int nkDP(int n, int m) {
        int[] ans = new int[n];
        ans[0] = 1; ans[1] = 1;
        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= m && j <= i ; j++) {
                ans[i] += ans[i-j];
            }
        }
        return ans[n-1];
    }

    public static int pow2(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static int shift(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                // swap
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return count;
    }
}
