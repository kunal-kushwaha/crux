package com.codingblocks;

import java.util.Scanner;

public class Q_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String S = input.nextLine();

        System.out.println(toggle(S));
    }

    public static String toggle(String S){

        StringBuilder builder = new StringBuilder(S);

        for (int i = 0; i < builder.length(); i++) {

            char ch = builder.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)('A' + (ch - 'a'));
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)('a' + (ch - 'A'));
            }

            builder.setCharAt(i, ch);
        }

        return builder.toString();
    }
}
