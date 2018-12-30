package com.codingblocks;

import java.util.Scanner;

public class Q_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();

        System.out.println(rev(s1, s2, 0, s2.length()-1));

    }

    public static boolean rev(String s1, String s2, int first, int last){

        if(last == -1){
            return true;
        }

        else
            return s1.charAt(first) == s2.charAt(last) && rev(s1,s2,first+1, last-1);

    }
}
