package com.codingblocks;

import java.util.Scanner;

public class Q_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        System.out.println(triSum(N, N));
    }

    public static int triSum(int N, int sum){

        if(N == 1){
            return 1;
        }

        return N + triSum(N-1, sum);
    }

}
