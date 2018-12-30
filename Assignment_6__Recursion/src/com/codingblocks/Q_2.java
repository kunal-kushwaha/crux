package com.codingblocks;

import java.util.Scanner;

public class Q_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        triangle(N, 0);
    }

    public static void triangle(int row, int col){

        if(row == 0){
            return;
        }

        if(col < row){
            System.out.print("*  ");
            triangle(row, col+1);
        }else{
            System.out.println();
            triangle(row-1, 0);
        }

    }

}
