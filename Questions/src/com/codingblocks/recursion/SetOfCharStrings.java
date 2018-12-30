package com.codingblocks.recursion;

import java.util.Scanner;

public class SetOfCharStrings {

    // Given a set of characters and a positive integer k,
    // print all possible strings of length k that can be formed from the given set.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.next();  // set

        int k = input.nextInt();

        sets("", str, k);
    }

    public static void sets(String processed, String unprocessed, int k){

        if(k == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i < unprocessed.length(); i++) {
            char ch = unprocessed.charAt(i);
            sets(processed + ch, unprocessed, k - 1);
        }

    }

}
