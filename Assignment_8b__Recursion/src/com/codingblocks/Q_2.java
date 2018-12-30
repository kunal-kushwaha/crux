package com.codingblocks;

import java.util.Scanner;

public class Q_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int R = input.nextInt();
        int C = input.nextInt();

        path("", R, C);
    }

    public static void path(String p, int row, int col){

        if(row == 1 && col == 1){
            System.out.println(p);
        }

        if(row > 1){
            path(p + 'D', row-1, col);
        }
        if(col > 1){
            path(p + 'R', row, col-1);
        }
    }

}
