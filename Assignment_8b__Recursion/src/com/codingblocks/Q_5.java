package com.codingblocks;

import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[][] board = new int[N][N];

        nQueens(board, 0);
    }

    public static void display(int[][] board){
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {

                if(board[i][j] == 1){
                    System.out.print("Q ");
                } else
                    System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void nQueens(int[][] board, int row){

       if(row == board.length){
           display(board);
           return;
       }

        for (int col = 0; col < board[0].length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = 1;

                nQueens(board, row + 1);

                board[row][col] = 0;
            }
        }

    }

    private static boolean isSafe(int[][] board, int row, int col) {

        // top
        for (int i = 0; i < row; i++) {
            if(board[i][col] == 1){
                return false;
            }
        }

        // diagonal left
        int max_left = Math.min(row, col);

        for (int i = 1; i <= max_left ; i++) {
            if(board[row-i][col-i] == 1){
                return false;
            }
        }

        // diagonal right
        int max_right = Math.min(row, board.length - col - 1);

        for (int i = 1; i <= max_right ; i++) {
            if(board[row-i][col+i] == 1){
                return false;
            }
        }

        return true;
    }

}
