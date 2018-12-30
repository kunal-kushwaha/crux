package com.codingblocks;

public class CountPallin {

    public static void main(String[] args) {

        System.out.println(countPallin("aababb"));
    }

    public static int countPallin(String line){

        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            int left = i;
            int right = i;

            // For odd length
            while (left >= 0 && right < line.length()){
                if (line.charAt(left) == line.charAt(right)){
                    count++;
                    left--;
                    right++;
                } else {
                    break;
                }
            }

            left = i;
            right = i+1;

            // for even length
            while (left >= 0 && right < line.length()){
                if (line.charAt(left) == line.charAt(right)){
                    count++;
                    left--;
                    right++;
                } else {
                    break;
                }
            }
        }

        return count;
    }


}
