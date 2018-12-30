package com.codingblocks;

import java.util.*;

public class LCS {

    public static void main(String[] args) {
        String first = "aman";
        String second = "manan";

        int[][] mem = new int[first.length() + 1][second.length() + 1];

        for (int i = 0; i < mem.length; i++) {
            Arrays.fill(mem[i], -1);
        }

        System.out.println(lcsRecDP(first, second, mem));
    }

    public static int lcsRec(String first, String second){

        if(first.isEmpty() || second.isEmpty()){
            return 0;
        }

        char f = first.charAt(first.length() - 1);
        char s = second.charAt(second.length() - 1);

        if(f == s){
            return 1 + lcsRec(first.substring(0, first.length() - 1),
                    second.substring(0, second.length() - 1));
        }else{
            return Math.max(  lcsRec(first.substring(0, first.length() - 1),
                    second), lcsRec(first, second.substring(0, second.length() - 1)));
        }
    }

    // if we look from starting

    public static int lcsRecS(String first, String second){

        if(first.isEmpty() || second.isEmpty()){
            return 0;
        }

        char f = first.charAt(0);
        char s = second.charAt(0);

        if(f == s){
            return 1 + lcsRecS(first.substring(1),
                    second.substring(1));
        }else{
            return Math.max(  lcsRecS(first.substring(1),
                    second), lcsRecS(first, second.substring(1)) );
        }
    }

    public static int lcsRecDP(String first, String second, int[][] mem){
        if (first.isEmpty() || second.isEmpty()){
            return 0;
        }

        if (mem[first.length()][second.length()] != -1){
            return mem[first.length()][second.length()];
        }

        char f = first.charAt(0);
        char s = second.charAt(0);

        if (f == s){
            mem[first.length()][second.length()] =  1 + lcsRecDP(first.substring(1),
                    second.substring(1), mem);

            return mem[first.length()][second.length()];
        } else {
            mem[first.length()][second.length()] =  Math.max(lcsRecDP(first.substring(1), second, mem),
                    lcsRecDP(first, second.substring(1), mem));

            return mem[first.length()][second.length()];
        }
    }

}
