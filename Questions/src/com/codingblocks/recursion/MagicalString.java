package com.codingblocks.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicalString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String string = scanner.next();
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = scanner.nextInt();
        }
        char[] str = string.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char ch = str[i];
            list.add(ch + "");
        }
        System.out.println(count(list, arr, 0));
    }

    public static int count(ArrayList<String> string, int[] arr, int index) {
        if (index == string.size() - 1 || index == string.size()) {
            return 1;
        }

        int res = 0;
        ArrayList<String> copy = new ArrayList<>();


        for (int i = 0; i < string.size(); i++) {
            copy.add(string.get(i));
        }


        if (index < string.size() - 1 && check(string.get(index) + string.get(index + 1), arr)) {
            string.set(index, string.get(index) + string.get(index + 1));
            string.remove(index + 1);
            res = res + count(string, arr, index + 1);
        }
        res += count(copy, arr, index + 1);

        return res;
    }

    public static boolean check(String string, int[] arr) {
        for (int i = 0; i < string.length(); i++) {
            if (arr[string.charAt(i) - 'a'] < string.length()) {
                return false;
            }
        }
        return true;
    }

}
