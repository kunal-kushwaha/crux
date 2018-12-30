package com.codingblocks;

import java.util.Scanner;

public class Q_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String S = input.nextLine();

        System.out.println(odd(S));

    }

    public static String odd(String S){

        StringBuilder builder = new StringBuilder(S);

        for (int i = 1; i < builder.length(); i += 2) {

            char ch = builder.charAt(i);

            ch = (char)(ch + 1);

            builder.setCharAt(i, ch);
        }

        return builder.toString();
    }

}
