package com.codingblocks;

public class Sieve {        // for prime till N: Complexity log(log N)

    public static void main(String[] args) {

        int n = 100;

        boolean[] primes = new boolean[n+1];

        for (int i = 2; i*i <= n ; i++) {

            if(!primes[i]){

                for (int j = 2*i; j <= n ; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {

            if(!primes[i]){
                System.out.println(i);
            }
        }

    }

}
