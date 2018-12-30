package com.codingblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        int M = input.nextInt();

        int[] nums2 = new int[M];

        for (int i = 0; i < M; i++) {
            nums2[i] = input.nextInt();
        }



    }
    public static int sum(int[] a, int[] b){

        String first = (a.toString());
        String second = (b.toString());

        int num1 = 0;
        int num2 = 0;
        int base_1 = 1;
        int base_2 = 1;

        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(0);
            int num = ch - '0';

            num1 += num*base_1;
            base_1 = base_1 * 10;
        }

        for (int i = 0; i < second.length(); i++) {

            char ch = second.charAt(0);
            int num = ch - '0';

            num2 += num*base_1;
            base_2 = base_2 * 10;
        }

        return num1 + num2;

    }
}
