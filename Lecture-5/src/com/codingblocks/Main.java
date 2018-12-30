package com.codingblocks;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        float num = 123.2f;
        System.out.printf("Num is %.2f yeah \n", num);

        String value = String.format("PI is %.2f", Math.PI);
        System.out.println(value);

        System.out.println(Math.abs(-2147483648));

        System.out.println(-15 % 2);    // -1
        System.out.println(15 % -2);    // 1

        System.out.println('b' + 'c');

        System.out.println((char) ('a' + 4));
    }
}
