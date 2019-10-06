package com.codingblocks;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i = 0; i < N; i++){

            String str = input.nextLine();

            if(str.length() >= 1 && str.length() <= 20)
                subseq("", str);

        }

    }

    public static void subseq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        subseq(processed + ch, unprocessed.substring(1)); // for accept
        subseq(processed, unprocessed.substring(1)); // for reject
    }

    public static void asciiSubseq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            if(processed.isEmpty()){
                return;
            }

            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        asciiSubseq(processed + ch, unprocessed.substring(1)); // for accept
        asciiSubseq(processed, unprocessed.substring(1)); // for reject
        asciiSubseq(processed + (ch+0), unprocessed.substring(1));
    }

    public static void numpad(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0';  // will convert '1' to 1

        // Example: digit = 2, then loop will go from 3 < 6
        // digit = 3, 6 < 9
        for (int i = (digit-1)*3; i < digit*3; i++) {
            if(i == 26){
                continue; // or break, note they are not same.
            }
            char ch = (char) (i + 'a');
            numpad(processed + ch, unprocessed.substring(1));
        }
    }

    public static void permutations(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        
        char ch = unprocessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {        // i <= processed.length() because there will be
            // length+1 cases in which we can place ch. for example: 4 places in abc.

            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());
            permutations(f+ch+s, unprocessed.substring(1));
        }
    }

    public static int permutationsCount(String processed, String unprocessed, int count){
        if(unprocessed.isEmpty()){
            return count;
        }

        char ch = unprocessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {        // i <= processed.length() because there will be
            // length+1 cases in which we can place ch. for example: 4 places in abc.

            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());
            return permutationsCount(f+ch+s, unprocessed.substring(1), count += 1);
        }
        return count;
    }

    public static void numsum(String processed, int target){

       if(target == 0){
           System.out.println(processed);
           return;
       }

        for (int i = 1; i <=6 && i <= target ; i++) {

            numsum(processed + i, target-i);
        }
    }

    public static void facenumsum(String processed, int target, int face){

        if(target == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= face && i <= target ; i++) {

            facenumsum(processed + i, target-i, face);
        }
    }

}
