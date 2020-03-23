package com.codingblocks.bitmasking;

import java.util.Scanner;

public class XORProfitProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int ans = maxXORInRange(x,y);
        System.out.println(ans);
    }
    static int maxXORInRange(int L, int R) {
        // get xor of limits
        int LXR = L ^ R;

        //  loop to get msb position of L^R
        int msbPos = 0;
        while (LXR > 0) {
            msbPos++;
            LXR >>= 1;
        }

        // construct result by adding 1,
        // msbPos times
        int maxXOR = 0;
        int two = 1;
        while (msbPos-- >0) {
            maxXOR += two;
            two <<= 1;
        }

        return maxXOR;
    }
}
