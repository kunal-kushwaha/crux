package com.codingblocks;

public class Bitwise {

    public static void main(String[] args) {

        System.out.println(countones(10));
        System.out.println(power(2,4));

    }

    public static int countones(int num){

        int count = 0;

        while(num > 0){
            if((num & 1) == 1){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static int power(int x, int n){

        int base = x;
        int result = 1;

        while(n > 0){
            if((n & 1) == 1){
                result = result * base;
            }
            n = n >> 1;
            base = base * base;
        }
        return result;
    }

    // find unique element in an array
    // because A XOR A = 0
    // A XOR A XOR B = B
    // Done in linear time
    public int unique(int[] nums){
        int res = 0;

        for(int a : nums){
            res = res ^ a;
        }

        return res;
    }

}
