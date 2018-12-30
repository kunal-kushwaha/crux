package com.codingblocks;

import java.util.Scanner;

public class Q_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
//        System.out.println(skiphi(str));
        System.out.println(counthi(str,0));

    }


    public static String skiphi(String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }

        char ch = unprocessed.charAt(0);

        if(unprocessed.startsWith("hi")){
            return skiphi(unprocessed.substring(2));
        }else{
            return ch + skiphi(unprocessed.substring(1));
        }
    }

    public static int counthi(String unprocessed, int count) {
        if (unprocessed.isEmpty()) {
            return count;
        }

        if(unprocessed.startsWith("hi")){
            return counthi(unprocessed.substring(2), ++count);
        }else{
            return counthi(unprocessed.substring(1), count);
        }
    }


}
