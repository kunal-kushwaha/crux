package com.codingblocks;

import java.util.Scanner;

public class Q_3 {

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
            path(p + 'V', row-1, col);
        }
        if(row > 1 && col > 1){
            path(p + 'D', row-1, col-1);
        }
        if(col > 1){
            path(p + 'H', row, col-1);
        }
    }

}
