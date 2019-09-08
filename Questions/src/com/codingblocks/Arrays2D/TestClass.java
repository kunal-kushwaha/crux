package com.codingblocks.Arrays2D;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            arr[i] = s.next().toCharArray();
        }

    }
    public static int count(String processed, char[][] arr, String target, int r, int c){
        if(processed.equals(target)){
            return 1;
        }
        if(r > arr.length || c > arr[0].length){
            return 0;
        }
        char ch = arr[r][c];
        int temp = 0;
        if(r < arr.length-1){
            temp += count(processed + ch, arr, target, r+1,c) + count(processed, arr, target, r+1,c);
        }
        if(c < arr[0].length-1){
            temp += count(processed + ch, arr, target, r,c+1) + count(processed, arr, target, r,c+1);
        }
        if(c < arr[0].length-1){
            temp += count(processed + ch, arr, target, r,c+1) + count(processed, arr, target, r,c+1);
        }
        return temp;
    }
}
