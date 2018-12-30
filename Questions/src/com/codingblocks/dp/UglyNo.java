package com.codingblocks.dp;

import java.util.Scanner;

public class UglyNo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        if(T >= 1 && T <=100){

            for (int i = 0; i < T; i++) {

                int N = input.nextInt();

                if(N >= 1 && N <= 10000){
                    System.out.println(nthUgno(N));
                }
            }
        }
    }
    public static long nthUgno(int n) {

        int last2 = 0;
        int last3 = 0;
        int last5 = 0;

        long[] result = new long[n];
        result[0] = 1;

        for (int i = 1; i < n; ++i) {
            long prev = result[i - 1];

            while (result[last2] * 2 <= prev) {
                ++last2;
            }
            while (result[last3] * 3 <= prev) {
                ++last3;
            }
            while (result[last5] * 5 <= prev) {
                ++last5;
            }
            long candidate1 = result[last2] * 2;
            long candidate2 = result[last3] * 3;
            long candidate3 = result[last5] * 5;

            result[i] = Math.min(candidate1, Math.min(candidate2, candidate3));
        }
        return result[n - 1];
    }
}
