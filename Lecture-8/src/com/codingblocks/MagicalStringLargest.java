package com.codingblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicalStringLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();    // length of string

        if (n > 0 && n <= 1000) {
            String str = input.next();  // string of length n

            int[] alphaNums = new int[26];  // array for numbers to letters
            for (int i = 0; i < 26; i++) {
                int x = input.nextInt();
                if (x > 0 && x <= 1000) {
                    alphaNums[i] = x;
                }
            }
            // input done

            String unprocessed ="";     // Unprocessed

            for (int i = 0; i < n; i++) {

                char ch = str.charAt(i);
                int num = (ch - 'a');

                unprocessed = unprocessed + alphaNums[num];
            }

            System.out.println(Magic(unprocessed));
//            System.out.println(min(unprocessed));
//            System.out.println(unprocessed);
        }
    }

    public static int min(String num){

        int min = 0;
        for (int i = 1; i < num.length(); i++) {
            if(num.charAt(i) < num.charAt(min))
                min = i;
        }
        return min;
    }


    public static int Magic(String unprocessed) {

        if(unprocessed.isEmpty()){
            return 0;
        }
        int minimum = min(unprocessed);
        int value = (int)(unprocessed.charAt(minimum)-'0');

        if (value < unprocessed.length()){

            if(value > unprocessed.substring(minimum+1).length()){
                String first = unprocessed.substring(0, minimum+1);
                String second = unprocessed.substring(minimum + 1);

                int a = Magic(first);
                int b = Magic(second);

                if(a > b){
                    return a;
                }else{
                    return b;
                }
            }else if (value > unprocessed.substring(0, minimum).length()){

                String first = unprocessed.substring(0, minimum+1);
                String second = unprocessed.substring(minimum + 1);

                int a = Magic(first);
                int b = Magic(second);

                if(a > b){
                    return a;
                }else{
                    return b;
                }
            }else{
                String first = unprocessed.substring(0, minimum);
                String second = unprocessed.substring(minimum + 1);

                int a = Magic(first);
                int b = Magic(second);

                if(a > b){
                    return a;
                }else{
                    return b;
                }
            }

        } else{
            return unprocessed.length();
        }
    }
}

