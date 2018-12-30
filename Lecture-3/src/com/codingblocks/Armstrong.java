package com.codingblocks;

public class Armstrong {
    public static void main(String[] args) {

        for(int i=100; i<999; i++){
            if(arm(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean arm(int num){
        int copy = num;
        int value = 0;

        while(copy>0){
            int rem = copy % 10;
            copy = copy /10;
            value = value + (int)Math.pow(rem, 3);
        }
        return value == num;
    }
}
