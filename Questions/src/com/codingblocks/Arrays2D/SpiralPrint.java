package com.codingblocks.Arrays2D;

import java.util.Scanner;

public class SpiralPrint {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int M = input.nextInt();
    int N = input.nextInt();

    int[][] arr = new int[M][N];
    if (M > 0 && M <= 10 && N > 0 && N <= 10) {

      for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
          arr[i][j] = input.nextInt();
        }
      }

      spiral(arr);
    }
  }

  public static void spiral(int[][] nums) {
    int left = 0;
    int right = nums[0].length - 1;
    int top = 0;
    int bottom = nums.length - 1;

    while (left <= right && top <= bottom) {

      for (int i = top; i <= bottom && left <= right; i++) { // down
        System.out.print(nums[i][left] + ", ");
      }
      left++;

      for (int i = left; i <= right && top <= bottom; i++) { // right
        System.out.print(nums[bottom][i] + ", ");
      }
      bottom--;

      for (int i = bottom; i >= top && left <= right; i--) { // up
        System.out.print(nums[i][right] + ", ");
      }
      right--;

      for (int i = right; i >= left && top <= bottom; i--) { // left
        System.out.print(nums[top][i] + ", ");
      }
      top++;
    }
    System.out.print("END");
  }
}
