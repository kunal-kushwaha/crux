package com.codingblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicalIter {
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

            int max = 2;
            int limit = nums.get(0);
            int i = 0;
            int count = 2;  // length

            for (int j = 1; j < n; ) {

                    limit = min(nums, i, j);

                    if (nums.get(j) >= count && limit >= count) {

                        if(j == n-1){
                            if (max < count) {
                                max = count;
                            }
                            break;
                        }

                        count++;
                        j++;

                    } else {
                        j = j - 1;
                        count = j - i + 1;

                        if (max < count) {
                            max = count;
                        }
                        i = i + 1;
                        count = j - i + 1;

                    }
                }

            System.out.println(max);
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
