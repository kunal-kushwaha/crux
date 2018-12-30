package com.codingblocks;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        lexoAlpha(freq(line), "", line.length(), line);

    }

    public static int[] freq(String line){

        int[] nums = new int[26];

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            nums[ch - 'a']++;
        }
        return nums;
    }

    public static void lexoAlpha(int[] count, String processed, int target, String source){

        if(processed.length() == target){

            if(processed.compareTo(source) > 0){

                System.out.println(processed);
            }
            return;
        }

        for (int i = 0; i < count.length; i++) {

            if(count[i] > 0){
                count[i]--;
                lexoAlpha(count, processed + (char)('a' + i), target, source);
                count[i]++;
            }
        }
    }
}
