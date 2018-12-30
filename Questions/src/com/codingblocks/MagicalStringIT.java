package com.codingblocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicalStringIT {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = scanner.nextInt();
        }
        // make string of numbers of str

        long a = 0;
        for (int i = 0; i < str.length(); i++) {
            int index = (int)str.charAt(i) - 'a';
            a = a*10 + arr[index];
        }

        System.out.println(a);

        List<List<String>> ans = split(a);

        System.out.println(ans);

        int length = ans.size();

        for(List<String> list : ans){
            for(String s : list){

                if(s.length() > min(s)){
                    length = length - 1;
                    break;
                }
            }
        }
        System.out.println(length % (int)(Math.pow(10, 9) + 7));
    }


    public static int min(String num){

        int min = num.charAt(0) - '0';

        for (int i = 0; i < num.length(); i++) {
            int n = num.charAt(i) - '0';
            if(n < min){
                min = n;
            }
        }
        return min;
    }

    public static List<List<String>> split(long n) {
        List<List<String>> result = new ArrayList<>();

        String num = String.valueOf(n);

        int maxSplit = 0;
        for (int i = 0; i < num.length() - 1; i++)
            maxSplit |= (1 << i);

        for (int i = 0; i <= maxSplit; i++) {
            List<Integer> split = new ArrayList<>();

            for (int b = 0; b < num.length() - 1; b++)
                if ((i & (1 << b)) != 0)
                    split.add(b + 1);

            split.add(num.length());

            List<String> strs = new ArrayList<>();
            int sp = 0;
            for (int s : split) {
                strs.add(num.substring(sp, s));
                sp = s;
            }

            result.add(strs);
        }

        return result;
    }
}
