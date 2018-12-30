package com.codingblocks;

public class Q_11 {
    public static void main(String[] args) {
        int result = gcd(4,12);
        System.out.println(result);
    }

    public static int gcd(int a, int b){

        int min;
        int max;
        int hcf=0;

        if (a < b){
            min = a;
            max = b;
        }

        else{
            min = b;
            max = a;
        }

        for (int i = 1; i <= min; i++) {
            if(min % i == 0 && max % i ==0)
                hcf = i;
        }
        return hcf;
    }
}
