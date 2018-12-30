package com.codingblocks;

public class Fibonacci {

    public static void main(String[] args) {

//        System.out.println(fiboRec(7));
        int N = 5000;
        long[] mem = new long[N+1];

        System.out.println(fiboRecDP(N, mem));

//        System.out.println(fiboRec(20));
    }

    public static int fiboRec(int N){

        if(N < 2){
            return N;
        }
        return fiboRec(N-1) + fiboRec(N-2);
    }

    // dynamic programming

    public static long fiboRecDP(int N, long[] mem){

        if(N < 2){
            return N;
        }

        if(mem[N]!= 0){
            return mem[N];
        }

        mem[N] = fiboRecDP(N-1,mem) + fiboRecDP(N-2,mem);
        return mem[N];
    }

    // in iteration memorization aka tabulation
    public static int fiboItrDP(int n, int[] mem){

        mem[0] = 0;
        mem[1] = 1;

        for (int i = 2; i <=n ; i++) {

            mem[i] = mem[i-1] + mem[i-2];

        }
        return mem[n];
    }




}
