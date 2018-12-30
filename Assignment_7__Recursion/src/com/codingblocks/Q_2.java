package com.codingblocks;

import java.util.Scanner;

public class Q_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.next();

        int result = (int)(convert(0,num.length()-1, num));

        System.out.println(result);

    }

    public static double convert(int sum, int base, String num) {

        if (num.isEmpty()) {
            return 0;
        }

        int digit = (int) (num.charAt(0) - '0');

        return digit * Math.pow(10, base) + convert(0, base - 1, num.substring(1));

    }
}
