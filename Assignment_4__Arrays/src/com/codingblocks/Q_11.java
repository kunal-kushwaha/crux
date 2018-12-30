package com.codingblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        int[] nums2 = new int[N];

        for (int i = 0; i < N; i++) {
            nums2[i] = input.nextInt();
        }
    }

}
