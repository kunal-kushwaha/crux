package com.codingblocks;

import java.util.Scanner;

public class Q_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String S = input.nextLine();

        System.out.println(maxFreq(S));
    }

    public static int max(int[] nums, int index, int max){

        if(index == nums.length){
            return max;
        }

        if(nums[index] > nums[max]){
            return max(nums, index+1, index);
        }else{
            return max(nums, index + 1, max);
        }
    }

    public static char maxFreq(String S){

        int[] alpha = new int[26];

        for (int i = 0; i < S.length(); i++) {

            while(i < S.length() - 1 && S.charAt(i) == S.charAt(i+1)){

                alpha[S.charAt(i) - 'a']++;
                i++;
            }
        }

        int index = max(alpha, 0, 0);
        char ch = (char)('a' + index);

        return ch;
    }


}
