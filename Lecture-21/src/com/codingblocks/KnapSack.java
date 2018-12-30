package com.codingblocks;

import java.util.*;

public class KnapSack {

    public static void main(String[] args) {
//        int[] cal = {200, 200, 100, 150};
//        int[] sat = {100, 150, 100, 250};

        int size = 100;

        int bag = 400;   // bag = capacity

        int[] cal = new int[size];
        int[] sat = new int[size];

        for (int i = 0; i < size; i++) {
            cal[i] = 50 + (int)(Math.random() * 50);
            sat[i] = 50 + (int)(Math.random() * 50);
        }

//        System.out.println(Arrays.toString(cal));
//        System.out.println(Arrays.toString(sat));

        int[][] mem1 = new int[bag + 1][size + 1];
        int[][] mem2 = new int[bag + 1][size + 1];

//        System.out.println(knapsack(bag, cal, sat, 0));
        System.out.println(knapsackItrDP(bag, cal, sat, mem1));
        System.out.println(knapsackDP(bag, cal, sat,0,  mem2));

    }

    public static int knapsack(int bag, int[] cal, int[] sat, int index){
        if(index == cal.length){
            return 0;
        }

        int accept = 0;

        if(cal[index] <= bag){
            accept = sat[index] + knapsack(bag - cal[index], cal, sat, index + 1);
        }

        int reject = knapsack(bag, cal, sat,index + 1);

        return Math.max(accept, reject);
    }

    public static int knapsackItrDP(int bag, int[] cal, int[] sat, int[][] mem){

        for (int b = 0; b <= bag ; b++) {
            for (int index = 0; index < cal.length ; index++) {

                if(b == 0){
                    mem[b][index] = 0;
                } else if(index == 0){
                    if(b >= cal[index]){
                        mem[b][index] = sat[index];
                    }
                } else{
                    int accept = 0;

                    if (b >= cal[index]){
                       accept = sat[index] + mem[b - cal[index]][index - 1];
                    }
                    int reject = mem[b][index - 1];
                    mem[b][index] = Math.max(accept, reject);
                }
            }
        }
        return mem[bag][cal.length - 1];
    }

    public static int knapsackDP(int bag, int[] cal, int[] sat, int index, int[][] mem){
        if(index == cal.length){
            return 0;
        }

        int accept = 0;

        if(mem[bag][index] != 0){
            return mem[bag][index];
        }

        if(cal[index] <= bag){
            accept = sat[index] + knapsackDP(bag - cal[index], cal, sat, index + 1, mem);
        }

        int reject = knapsackDP(bag, cal, sat,index + 1, mem);

        mem[bag][index] = Math.max(accept, reject);

        return mem[bag][index];
    }
}
