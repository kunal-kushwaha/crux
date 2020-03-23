package com.codingblocks.array;

import java.io.*;

public class Reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String size = br.readLine();
        int n = Integer.parseInt(size);
        String arr = br.readLine();
        int[] ar = new int[n];
        String[] items = arr.split(" ");
        for(int i=0; i<n; i++) {
            ar[i] = Integer.parseInt(items[i]);
        }
        int[] ans = reverse(ar);
        for(int i=0; i < n; i++) {
            bw.write(String.valueOf(ans[i]));
            if(i != n-1) {
                bw.write(" ");
            }
        }
        bw.newLine();
        bw.close();
    }
    private static int[] reverse(int[] arr) {
        int end = arr.length - 1;
        for(int i=0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
        }
        return arr;
    }
}
