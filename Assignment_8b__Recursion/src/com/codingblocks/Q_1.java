package com.codingblocks;

import java.util.*;

public class Q_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int M = input.nextInt(); // faces

        numSum("", N, M);

    }

    public static void numSum(String moves, int target, int faces){

        if(target == 0){
            System.out.println(moves);
            return;
        }

        for (int i = 1; i <= faces && i <= target; i++) {
            numSum(moves + i, target - i, faces);
        }
    }
}
