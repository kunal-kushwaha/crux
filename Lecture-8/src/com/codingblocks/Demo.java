package com.codingblocks;

import java.util.*;
import java.math.*;

public class Demo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        boolean[][] board = new boolean[n][n];

        System.out.println(nQueens(board, 0));
    }

    public static int nQueens(boolean[][] board, int row){

        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for (int col = 0; col < board[0].length; col++) {

            if(isSafe(board, row, col)){
                board[row][col] = true; // placed
                count = count + nQueens(board, row+1);
                board[row][col] = false; // unplaced
            }
        }
        return count;
    }

    public static void display(boolean[][]board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if(board[i][j]){
                    System.out.print(" Q ");
                }else{
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isSafe(boolean[][] board, int row, int col){

        // upwards
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        // diagonal left
        int max_left = Math.min(row, col);
        for (int i = 1; i <= max_left; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        // diagonal right
        int max_right = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= max_right; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

}

