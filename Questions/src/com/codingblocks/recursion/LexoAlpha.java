package com.codingblocks.recursion;

import java.util.Scanner;

public class LexoAlpha {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        lexoG(arr(line), "", line.length());

    }

    public static int[] arr(String line){

        int[] num = new int[26];
        for (int i = 0; i < line.length(); i++) {
            num[line.charAt(i) - 'a']++;
        }
        return num;
    }


    public static void lexoG(int[] count, String processed, int target){

        if(processed.length() == target){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i < 26; i++) {

            if(count[i] > 0){
                count[i]--;
                lexoG(count, processed + (char)('a' + i), target);
                count[i]++;
            }
        }

    }
}
