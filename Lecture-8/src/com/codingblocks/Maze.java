package com.codingblocks;

import java.util.*;

public class Maze {

    public static void main(String[] args) {
//        mazepath("", 3,3);
//        mazepath("", 3, 3);
//        ArrayList<String> result = mazepathR("", 3, 3);
//
//        System.out.println(result.toString());

        boolean[][] board = {
                {true, false, false, true},
                {true, true, false, true},
                {true, true, true, true},
                {false, true, true, true},
                {true, true, false, true}
        };
        boolean[][] board2 = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        mazeBool("", board2, 0, 0);
        allPath("", board2, 0, 0);

    }

    public static int mazecount(int row, int col){  // possible ways to reach a goal in a matrix at n,n
        if(row == 1 || col == 1){
            return 1;
        }

        int r1 =  mazecount(row-1, col);
        int r2 = mazecount(row, col-1);
        return r1 + r2;

    }

    public static void mazepath(String path, int row, int col){

        if(row == 1 && col == 1){
            System.out.println(path);
            return;
        }
        if(row > 1){
            mazepath(path + 'D', row-1, col);

        }
        if(col > 1)
            mazepath(path + 'R', row, col-1);
        return;
    }

    public static ArrayList<String> mazepathR(String path, int row, int col){

        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> l = new ArrayList<>();

        if(row > 1){

            l.addAll(mazepathR(path + 'D', row-1, col)) ;

        }
        if(col > 1) {
            l.addAll(mazepathR(path + 'R', row, col-1));
        }
        return l;
    }

    public static ArrayList<String> mazepathDiagonal(String path, int row, int col){

        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> l = new ArrayList<>();

        if(row > 1 && col > 1){
            l.addAll(mazepathDiagonal(path + 'D', row-1, col-1));
        }
        if(row > 1){
            l.addAll(mazepathDiagonal(path + 'V', row-1, col)) ;
        }
        if(col > 1) {
            l.addAll(mazepathDiagonal(path + 'H', row, col-1));
        }
        return l;
    }

    public static void mazeBool(String path, boolean[][] board, int row, int col){

        if(row == board.length-1 && col == board[0].length-1){
            System.out.println(path);
            return;
        }

        if (!board[row][col]){
            return;
        }

        if(row < board.length - 1){
            mazeBool(path + 'V', board, row+1, col);
        }

        if(col < board[0].length - 1){
            mazeBool(path + 'H', board, row, col+1);
        }
    }

    // Backtracking

    public static void allPath(String path, boolean[][] board, int row, int col){
        if (row == board.length - 1 && col == board[0].length - 1){
            System.out.println(path);
            return;
        }

        if (!board[row][col]){
            return;
        }

        board[row][col] = false;

        if (row < board.length - 1){
            allPath(path +'D', board, row+1, col);
        }
        if (col < board[0].length - 1){
            allPath(path+'R', board, row, col + 1);
        }
        if (row > 0){
            allPath(path+ 'U', board, row - 1, col);
        }
        if (col > 0){
            allPath(path + 'L', board, row, col-1);
        }
        board[row][col] = true;
    }

    public static void allPathNum(String path, boolean[][] board, int row, int col, int[][] steps, int temp){

        if(row == board.length - 1 && col == board[0].length - 1){
            steps[row][col] = path.length() + 1;
            display(steps);
            System.out.println(path);
            System.out.println();
            return;
        }

        if(!board[row][col]){
            return;
        }

        board[row][col] = false;

        steps[row][col] = temp;

        if(row > 0){ allPathNum(path + 'U', board, row - 1, col, steps, temp + 1);
        }
        if(row < board.length - 1){
            allPathNum(path + 'D', board, row + 1, col, steps, temp + 1);
        }
        if(col > 0){
            allPathNum(path + 'L', board, row, col - 1, steps, temp + 1);
        }
        if(col < board[0].length - 1){
            allPathNum(path + 'R', board, row, col + 1, steps, temp + 1);
        }

        board[row][col] = true;
        steps[row][col] = 0;
    }

    public static void display(int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
