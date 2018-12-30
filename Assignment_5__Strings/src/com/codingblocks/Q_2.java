package com.codingblocks;

import java.util.Scanner;

public class Q_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String S = input.nextLine();

        System.out.println(SubStringPalin(S));

    }

    public static int SubStringPalin(String S){

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = i+1; j <= S.length(); j++) {

                if(Q_1.palindrome(S.substring(i,j)))
                     count++;
            }
        }
        return count;
    }
}
