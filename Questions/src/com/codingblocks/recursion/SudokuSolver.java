package com.codingblocks.recursion;

/*

5 3 0 0 7 0 0 0 0
6 0 0 1 9 5 0 0 0
0 9 8 0 0 0 0 6 0
8 0 0 0 6 0 0 0 3
4 0 0 8 0 3 0 0 1
7 0 0 0 2 0 0 0 6
0 6 0 0 0 0 2 8 0
0 0 0 4 1 9 0 0 5
0 0 0 0 8 0 0 7 9

 */

public class SudokuSolver {
    static int count = 0;
    public static void main(String[] args) {

        int[][] sudoku = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        solveSudoku(sudoku, 0, 0, 9);
        System.out.println(count);
    }

    public static boolean solveSudoku(int[][] mat, int i, int j, int n) {
        // Base Case
        if(i == n) {
            // Print the matrix
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < n; l++) {
                    System.out.print(mat[k][l] + " ");
                }
                System.out.println();
            }
            return true;
        }

        // Case for the row end
        if(j == n) {
            return solveSudoku(mat, i+1, 0, n);
        }

        // Skip the prefilled cells
        if(mat[i][j] != 0) {
            return solveSudoku(mat, i, j+1, n);
        }

        // Recursive Case
        // Fill the current cell with possible options
        for (int number = 1; number <= n; number++) {
            if(canPlace(mat, i, j, n, number)) {
                // Assume this is true
                mat[i][j] = number;
                boolean couldBeSolved = solveSudoku(mat, i, j+1, n);
                if(couldBeSolved) {
                    return true;
                }
            }
        }

        // backtrack here
        mat[i][j] = 0;
        return false;
    }

    private static boolean canPlace(int[][] mat, int i, int j, int n, int number) {
        count++;
        // Row and Column check
        for (int k = 0; k < n; k++) {
            if(mat[k][j] == number || mat[i][k] == number) {
                return false;
            }
        }

        // Check for sub grid
        int rn = (int) Math.sqrt(n);
        int sx = (i/rn) * rn;
        int sy = (j/rn) * rn;

        for (int x = sx; x < sx + rn; x++) {
            for (int y = sy; y < sy + rn ; y++) {
                if(mat[x][y] == number) {
                    return false;
                }
            }
        }
        return true;
    }

}










