package com.codingblocks;

public class Demo {

    public static void main(String[] args) {

        print(5);

    }

    public static void print(int n){

        start: while(n > 0){
            if(n == 0){
                return;
            }
            System.out.println(n);

            n = n - 1;
            continue start;
        }
    }

}
