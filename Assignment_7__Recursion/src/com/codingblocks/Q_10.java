package com.codingblocks;

import java.util.Scanner;

public class Q_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();

        System.out.println(twins(str, 0));
    }

    public static int twins(String str, int count){

        if(str.isEmpty()){
            return 0;
        }

        char ch = str.charAt(0);

        if(str.length() > 2){
            if(ch == str.charAt(2)){
                return twins(str.substring(1), count += 1);
            }else{
                return twins(str.substring(1), count);
            }
        }
        return count;
    }
}
