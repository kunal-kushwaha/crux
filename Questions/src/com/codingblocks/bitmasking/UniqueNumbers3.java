package com.codingblocks.bitmasking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers3 {
    public static void main(String[] args) {
         Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

         // one distinct element and rest occurring thrice
         int[] arr = {7,1,3,7,2,1,3,7,1,3};
         
         int[] bits = new int[32];

        for (int i = 0; i < arr.length; i++) {
            int rem;
            int index = 0;
            int num = arr[i];
            while(num > 0) {
                rem = num % 10;
                num = num / 10;
                if(rem == 1) {
                    bits[index]++;
                }
                index++;
            }
        }

        System.out.println(Arrays.toString(bits));
         
    }
}
