package com.codingblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicalString2MinCount {
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

            ArrayList<Integer> nums = new ArrayList<>();

            for (int i = 0; i < n; i++) {

                char ch = str.charAt(i);
                int index = (int) (ch - 'a');
                nums.add(alphaNums[index]);
            }


            int count = 0;
            int length = 1;
            int limit = nums.get(0);
            int start = 0;

            for (int i = 0; i < nums.size() ;) {

                if(i == nums.size() - 1){
                    if(nums.get(i) >= length && length <= limit){
                        count++;
                        break;
                    }else{
                        count += 2;
                        break;
                    }
                }

                limit = min(nums, start, i);

                if(nums.get(i) >= length && length <= limit){
                    length++;
                    i++;
                }else{
                    start = i;
                    count++;
                    length = 1;
                }

            }

            System.out.println(count);
        }
    }

    public static int min(ArrayList<Integer> nums, int start, int last){

        int m = nums.get(start);
        for (int i = start + 1; i <= last; i++) {
            if(nums.get(i) < m)
                m = nums.get(i);
        }
        return m;
    }

}
