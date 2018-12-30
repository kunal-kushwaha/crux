package com.codingblocks;

import java.util.Scanner;

public class Q_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String num = input.next();

        int result = sumF(num);
        System.out.println(result);
    }

    public static int sumF(String num){

        if(num.isEmpty()){
            return 0;
        }

        int digit = (int)(num.charAt(0) - '0');

        return digit + sumF(num.substring(1));
    }


}




