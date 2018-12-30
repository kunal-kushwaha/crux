package com.codingblocks;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        if(N >=1 && N <=100000){

            long[] nums = new long[N];
            for (int i = 0; i < N; i++) {
                nums[i] = input.nextLong();
            }
            int Q = input.nextInt();

            if(Q >=0 && Q <= 1000000){

                long[] nums2 = Arrays.copyOf(nums, N);

                for (int i = 0; i < Q; i++) {

                    int X = input.nextInt();

                    if(X >=0 && X < N){
                        for (int j = 0; j < nums.length; j++) {

                            if(j >= X)
                                nums2[j] = nums[j] + nums[j-X];
                            else if(j < X){
                                nums2[j] = nums[j] + nums[nums.length-X+j];
                            }
                        }
                        nums = Arrays.copyOf(nums2, N);
                    }
                }
                long sum = sumOfArray(nums2);
                System.out.println(sum);
            }
        }
    }

    private static long sumOfArray(long[] nums2) {

        long sum = 0;
        for (int i = 0; i < nums2.length; i++) {
            sum = sum + nums2[i];
        }
        return sum;
    }

}
