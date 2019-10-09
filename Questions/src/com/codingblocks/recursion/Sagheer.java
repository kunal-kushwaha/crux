package com.codingblocks.recursion;

import java.util.Arrays;
import java.util.Scanner;

/*
        3 4 001000 000010 000010
 */
public class Sagheer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] building = new int[n][m+2];

        for (int i = 0; i <n ; i++) {
            String s = scanner.next();
            for (int j = 0; j <m+2 ; j++) {
                building[i][j] = s.charAt(j) - '0';
            }
        }
        boolean foundOne = false;
        int topZeroRow = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <m+2 ; j++) {
                if (building[i][j] == 1){
                    foundOne = true;
                }
            }
            if (foundOne){
                break;
            }
            else{
                topZeroRow++;

            }
        }
        int[][] build = Arrays.copyOfRange(building , topZeroRow , n);

        for (int i = 0; i < build.length; i++) {
            for (int j = 0; j < build[0].length; j++) {
                System.out.print(build[i][j] + " ");
            }
            System.out.println();
        }

//        System.out.println(topZeroRow);

        System.out.println(calculate(n-1-topZeroRow, 0 , build));
    }

    private static int calculate(int floor, int door, int[][] building) {
        if (floor==-1){
            return 0;
        }

        int cost = 0;
        if (door == 0) {
            for (int i = door; i < building[0].length; i++) {
                if (building[floor][i] == 1) {
                    cost = i;
                }
            }
            if (floor == 0){
                return cost;
            }
            // Pre-compute position (index) of room with light on from left and right for each row
            int left = calculate(floor-1 , 0 , building);
            int right = calculate(floor-1 , building[0].length-1 , building);
            return 1+ Math.min(2*cost + left, building[0].length-1 + right);

        } else {
            for (int i = building[0].length-1; i >= 0 ; i--) {
                if (building[floor][i] == 1){
                    cost = building[0].length -1- i;
                }
            }
            if (floor == 0){
                return cost;
            }
            int left = calculate(floor-1 , 0 , building);
            int right = calculate(floor - 1 , building[0].length-1 , building);
            return 1 + Math.min( building[0].length -1 +  left, 2*cost+ right);
        }
    }
}
