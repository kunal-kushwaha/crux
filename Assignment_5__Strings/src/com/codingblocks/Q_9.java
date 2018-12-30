package com.codingblocks;

import java.util.Scanner;

public class Q_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String S = input.nextLine();

        System.out.println(duplicates(S));

    }

    public static String duplicates(String S){

        StringBuilder builder = new StringBuilder();

        int count = 0;

        for (int i = 0; i < S.length(); i++) {

            while(i < S.length() - 1 && S.charAt(i) == S.charAt(i+1)){

                count = 0;
                count++;
                i++;
            }

            builder.append(S.charAt(i));
        }
        return builder.toString();
    }

}
