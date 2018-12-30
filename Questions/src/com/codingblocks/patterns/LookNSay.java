package com.codingblocks.patterns;

import java.util.Scanner;

public class LookNSay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of lines: ");
        int N = input.nextInt(); // Number of lines

        String initial = "1";

        System.out.println(initial);

        for (int i = 0; i < N - 1; i++) {

            System.out.println(countDup(initial));
            initial = countDup(initial);
        }
    }

    public static String countDup(String num){

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            int count = 1;

            while(i < num.length() - 1 && num.charAt(i + 1) == num.charAt(i)){
                count++;
                i++;
            }
            builder.append(count);
            builder.append(num.charAt(i));
        }

        return(builder.toString());
    }


}
