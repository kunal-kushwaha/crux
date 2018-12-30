package com.codingblocks;

import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        snakeLadder("", N*N, N*N);

    }



    public static void snakeLadder(String path, int target, int size){

        if(target == 0){
            System.out.println(path);
            return;
        }

        if(isPrime(size - target)){
            int lastPrime = lastPrime(size - target, size);
            if(lastPrime > (size - target)){
                snakeLadder(path + 'L', size - lastPrime, size);
            }else{
                for (int i = 1; i<= 6 && i <= target ; i++) {
                    snakeLadder(path + i, target - i, size);
                }
            }
        }else{
            for (int i = 1; i <= 6 && i <= target ; i++) {
                snakeLadder(path + i, target - i, size);
            }
        }
    }

    private static int lastPrime(int target, int size) {

        int count = 0;

        for (int i = 2; i < target; i++) {
            if(isPrime(i)){
                count++;
            }
        }

        for (int i = size; i > 0 ; i--) {

            if(isPrime(i)){
                if(count == 0){
                    return i;
                }else{
                    count--;
                }
            }

        }
        return 0;
    }

    private static boolean isPrime(int i) {

        if(i < 2){
            return false;
        }

        int c = 2;

        while(c * c < i){
            if(i % c == 0){
                return false;
            }else{
                c += 1;
            }
        }
        if(c * c > i){
            return true;
        }else{
            return false;
        }

    }

}
