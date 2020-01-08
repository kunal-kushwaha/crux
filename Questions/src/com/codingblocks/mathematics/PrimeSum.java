package com.codingblocks.mathematics;

import java.util.Scanner;

public class PrimeSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(ans(n));
    }

    public static int ans(int n) {
        if(n > 2) {
            if(n % 2 == 0) {
                return 2;
            }
            // Check if n-2 is prime
            if(prime(n-2)) {
                return 2;
            }
            return 3;
            // This is because we know odd + odd = even and even + odd = odd. So when N is odd,
            // and K = 2 one number must be 2 as it is the only even prime number so now the
            // answer depends whether N-2 is odd or not.
        }
        return 1;
    }

    public static boolean prime(int n) {
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
