package com.codingblocks;

import java.util.*;

public class Q_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        if(N >= 1 && N <=1000){

            if(N % 2 == 1){
                System.out.println(N);
                oddEven(N);
            }else{
                oddEven(N);
                System.out.println(N);
            }

        }
    }

    public static void oddEven(int N){

        if(N == 1)
            return;

        if(N % 2 == 0)
            System.out.println(N-1);

        oddEven(N-1);

        if(N % 2 == 1)
          System.out.println(N-1);

    }
}
