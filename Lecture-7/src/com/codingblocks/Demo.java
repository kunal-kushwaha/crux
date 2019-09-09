package com.codingblocks;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        String str = s.next();
//        subseq("", str);
//        permutation("", str);
        numsum("", 10);
    }

    private static void subseq(String processed, String unprocessed) {

        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subseq(processed + ch, unprocessed.substring(1));
        subseq(processed, unprocessed.substring(1));
    }

    public static void permutation(String p, String up) {

        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i);
            permutation(f + ch + l, up.substring(1));
        }
    }

    public static void numsum(String p, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            numsum(p + i, target-i);
        }

    }


}