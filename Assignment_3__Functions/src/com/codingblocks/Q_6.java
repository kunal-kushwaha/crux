package com.codingblocks;

public class Q_6 {
    public static void main(String[] args) {
        int result = six(234454, 4);
        System.out.println(result);
    }

    public static int six(int num, int dig){
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            num = num /10;
            if(rem == dig)
                count++;
        }
        return count;
    }
}
