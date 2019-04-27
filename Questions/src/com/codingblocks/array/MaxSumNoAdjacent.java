package com.codingblocks.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxSumNoAdjacent {
    public static void main(String[] args) {
        // Q : Maximum sum such that no two elements are adjacent
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int[] nums = new int[n];
            // Input Done
            for (int j = 0; j < n; j++) {
                nums[j] = s.nextInt();
            }

            ArrayList first = new ArrayList();
            ArrayList second = new ArrayList();

            int inc = nums[0];
            int exc = 0;
            for (int j = 1; j < n; j++) {
                int temp = Math.max(inc,exc);
                if(exc < inc){
                    ArrayList firstT = first;

                    first = new ArrayList();
                    first.addAll(second);
                    first.add(Math.abs(nums[j]));

                    second = new ArrayList();
                    second.addAll(firstT);
//                    second.add(nums[j]);


                }else{
                    first = new ArrayList();
                    first.addAll(second);
                    first.add(Math.abs(nums[j]));
                }
                inc = exc + nums[j];
                exc = temp;
            }

            if(inc > exc){
                System.out.println(first);
            }else{
                System.out.println(second);
            }
        }
    }
}
