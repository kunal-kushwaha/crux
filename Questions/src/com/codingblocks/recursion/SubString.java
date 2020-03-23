package com.codingblocks.recursion;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        subStr(str);
    }

    public static void subStr(String str) {
        if (str.isEmpty()) {
            return;
        }
        for (int j = 0; j < str.length(); j++) {
            String sub = str.substring(0, j+1);
            System.out.println(sub);
        }
        subStr(str.substring(1));
    }

}
