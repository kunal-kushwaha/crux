package com.codingblocks;

import java.util.Scanner;

public class RatMaze {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        char[][] maze = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = s.next();
            maze[i] = line.toCharArray();
        }

        int[][] path = new int[N][M];
        boolean ans = ratmaze(maze, 0,0,path);
        if(ans){
            display(path);
        }
    }

//    public static boolean ratmaze(char maze[][], int i, int j, int path[][]) {
//        if (i == maze.length - 1 && j == maze[0].length - 1) {
//            path[i][j] = 1;
//            return true;
//        }
//
//        if (i >= 0 && i < maze.length && j >= 0 && j < maze[0].length && maze[i][j] == 'O') {
//            path[i][j] = 1;
//
//            if (ratmaze(maze, i + 1, j, path))
//                return true;
//
//            if (ratmaze(maze, i, j + 1, path))
//                return true;
//
//            path[i][j] = 0;
//            return false;
//        }
//        return false;
//    }

    public static boolean ratmaze(char maze[][], int i, int j, int path[][]) {
        if (i == maze.length - 1 && j == maze[0].length - 1) {
            path[i][j] = 1;
            return true;
        }

        path[i][j] = 1;

        if(i >= 0 && i < maze.length - 1 && maze[i][j] == 'O'){
            if (ratmaze(maze, i + 1, j, path))
                return true;
        }

        if(j >= 0 && j < maze[0].length - 1 && maze[i][j] == 'O'){
            if (ratmaze(maze, i, j + 1, path))
                return true;
        }

        path[i][j] = 0;

        return false;
    }

    public static void display(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}