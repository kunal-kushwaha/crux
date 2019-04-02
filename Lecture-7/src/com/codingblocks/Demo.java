package com.codingblocks;

import java.util.*;

public class Demo {
    private static int rows;
    private static int cols;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        rows = input.nextInt();
        cols = input.nextInt();
        int [][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = input.nextInt();
            }
        }

        System.out.println(connectedCell(matrix));
    }


    public static int connectedCell(int [][] matrix) {
        int maxCount = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                if (matrix[row][col] == 1) {
                    int ans  = dfs(matrix, row, col);
                    maxCount = Math.max(maxCount, ans);
                }
            }
        }
        return maxCount;
    }

    private static int dfs(int [][] matrix, int r, int c) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || matrix == null || matrix[r][c] == 0) {
            return 0;
        }

        matrix[r][c] = 0;
        int size = 1;

        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                size += dfs(matrix, i, j);
            }
        }

        return size;
    }
}