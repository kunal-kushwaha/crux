package com.codingblocks.dp;

import java.util.Scanner;

public class LongestPalinSubSeq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println(subseq(0, s.length()-1, s));

        // Memoization
        int[][] mem = new int[s.length()][s.length()];
        System.out.println(subseqDP(0, s.length()-1, s, mem));
    }

    private static int subseq(int f, int l, String s) {
        // just one character
        if(f == l){
            return 1;
        }
        boolean equals = s.charAt(f) == s.charAt(l);
        
        // two characters only
        if(equals && f+1 == l) {
            return 2;
        }
        if(equals) {
            return subseq(f+1, l-1, s) + 2;
        }
        return Math.max(subseq(f+1,l,s), subseq(f,l-1,s));
    }

    private static int subseqDP(int f, int l, String s, int[][] mem) {
        if(f == l){
            return 1;
        }
        if(mem[f][l] != 0){
            return mem[f][l];
        }
        boolean equals = s.charAt(f) == s.charAt(l);
        if(equals && f+1 == l) {
            return 2;
        }
        if(equals) {
            mem[f][l] = subseqDP(f+1, l-1, s, mem) + 2;
            return mem[f][l];
        }
        mem[f][l] = Math.max(subseqDP(f+1,l,s, mem), subseqDP(f,l-1,s, mem));
        return mem[f][l];
    }
}
