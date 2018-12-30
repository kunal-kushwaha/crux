package com.codingblocks;

import java.util.*;

public class Board {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] mem = new int[N+1];

//        System.out.println(countBoardrecDP(N,4, mem));

        System.out.println(countBoardItrDP(N, 6, mem));
    }

    public static int countBoardrec(int target, int face){

        if(target == 0){

            return 1;
        }

        int count = 0;

        for (int i = 1; i <= face && i <= target ; i++) {

            count += countBoardrec(target-i, face);

        }
        return count;
    }

    public static int countBoardrecDP(int target, int face, int[] mem){

        if(target == 0){
            return 1;
        }

        if(mem[target]!= 0){
            return mem[target];
        }

        int count = 0;

        for (int i = 1; i <= face && i <= target ; i++) {
            count += countBoardrecDP(target-i, face, mem);

        }
        mem[target] = count;
        return mem[target];
    }

    public static int countBoardItrDP(int target, int faces, int[]mem){

        mem[0] = 1;

        for (int local = 1; local <= target ; local++) {

            int count  = 0;

            for (int face = 1; face <= faces && face <= local ; face++) {

                count += mem[local-face];
            }

            mem[local] = count;
        }
        return mem[target];
    }

}
