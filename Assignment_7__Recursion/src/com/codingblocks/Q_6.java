package com.codingblocks;

import java.util.Scanner;

public class Q_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        duplicates("", str);
    }

    public static void duplicates(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if(unprocessed.length() == 1){
            duplicates(processed + ch, unprocessed.substring(1));
        }else{
            if(unprocessed.charAt(1) != ch){
                duplicates(processed + ch, unprocessed.substring(1));
            }else{
                duplicates(processed, unprocessed.substring(1));
            }
        }
    }
}
