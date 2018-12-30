package com.codingblocks;

import java.util.Scanner;

public class Q_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        triangle(0,0,N);

    }

    public static void triangle(int row, int col, int n){

        if(row == n+1){
            return;
        }

        if(col < row){
            System.out.print(" *");
            triangle(row, col+1,n);
        }else{
            System.out.println();
            triangle(row+1, 0,n);
        }

    }

}
