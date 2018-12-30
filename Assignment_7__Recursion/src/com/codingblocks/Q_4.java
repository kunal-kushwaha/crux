package com.codingblocks;

import java.util.Scanner;

public class Q_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s1 = input.next();

        System.out.println(palin(s1, 0, s1.length()-1));
    }

    public static boolean palin(String str, int first, int last){
        if(first > last){
            return true;
        }

        return str.charAt(first) == str.charAt(last) && palin(str, first + 1, last - 1);
    }

}
