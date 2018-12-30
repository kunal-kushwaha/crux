package com.codingblocks;

import java.util.Scanner;

public class MultiDArray {
    public static void main(String[] args) {
        int [][] nums = new int[2][4];
        // 2(= nums.length) rows, 4(= nums[i].length) columns
        // if we write int [][] nums = new int[2][];
        // it means that there is no value to point, hence rows will
        // point to null.
        for(int i =0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] kadane(int[] nums) {

        int[] result = new int[]{Integer.MIN_VALUE, 0, -1};
        int sum = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 0) {
                sum = 0;
                start = i + 1;
            } else if (sum > result[0]) {
                result[0] = sum;
                result[1] = start;
                result[2] = i;
            }
        }

        if (result[2] == -1) {
            result[0] = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > result[0]) {
                    result[0] = nums[i];
                    result[1] = i;
                    result[2] = i;
                }
            }
        }

        return result;
    }


    public static void findMaxSubMatrix(int[][] a) {
        int cols = a[0].length;
        int rows = a.length;
        int[] Result;
        int maxSum = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        int bottom = 0;
        int top = 0;


        for (int leftCol = 0; leftCol < cols; leftCol++) {
            int[] tmp = new int[rows];

            for (int rightCol = leftCol; rightCol < cols; rightCol++) {

                for (int i = 0; i < rows; i++) {
                    tmp[i] += a[i][rightCol];
                }
                Result = kadane(tmp);
                if (Result[0] > maxSum) {
                    maxSum = Result[0];
                    left = leftCol;
                    top = Result[1];
                    right = rightCol;
                    bottom = Result[2];
                }
            }
        }
        System.out.println(maxSum);
    }
}
