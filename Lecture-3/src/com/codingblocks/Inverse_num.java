package com.codingblocks;

import java.util.Scanner;

public class Inverse_num {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if( N > 0 && N < 1000000000){
            int result = inv(N);
            System.out.println(result);
        }
    }


    public static int inv(int N){
        double temp = 0;
        int value = 1;
        while(N > 0){
            double index = N % 10;
            temp = temp + Math.pow(10, index)*value;
            value++;
            N = N / 10;
        }
        return (int)(temp)/10;
    }
}
