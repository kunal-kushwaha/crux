package com.codingblocks;

import java.util.*;

public class Q_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String S = input.nextLine();

        System.out.println(palindrome(S));

    }

    public static boolean palindrome(String S){

        for (int i = 0; i < S.length() / 2; i++) {

            int last = S.length() - 1 - i;

            if(S.charAt(i) != S.charAt(last))
                return false;

        }
        return true;
    }
}
