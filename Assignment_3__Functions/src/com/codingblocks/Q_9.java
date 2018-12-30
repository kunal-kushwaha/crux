package com.codingblocks;

public class Q_9 {

    public static void main(String[] args) {
        boolean result = arm(371);
        System.out.println(result);
    }
    public static boolean arm(int n){
        int sum = 0;
        int number = n;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        if(sum == number)
            return true;
        return false;
    }
}
