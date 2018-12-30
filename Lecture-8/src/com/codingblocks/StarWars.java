package com.codingblocks;

import java.util.Scanner;
import java.math.*;
public class StarWars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String x = input.next();

        BigInteger f = new BigInteger(starWars("", x, 0));

        System.out.println(f);


    }

    public static String starWars(String processed, String unprocessed, int initial){


        if(unprocessed.isEmpty()){
            return processed;
        }

        if(unprocessed.charAt(initial) == '9'){
            return starWars(processed + unprocessed.charAt(initial), unprocessed.substring(1), initial);

        }
        int digit = (int)(unprocessed.charAt(0) - '0');

        if(digit > 4){
            int n = 9 - digit;
            return starWars(processed + n, unprocessed.substring(1), initial);
        }else{
            return starWars(processed + digit, unprocessed.substring(1), initial);
        }
    }
}
