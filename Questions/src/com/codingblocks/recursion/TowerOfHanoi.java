package com.codingblocks.recursion;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        towerOfHanoi(N, "T1", "T2", "T3");

        int c = count(N, "T1", "T2", "T3");
        System.out.println(c);
    }

    static void towerOfHanoi(int n, String from, String to, String aux)
    {
        if (n == 1)
        {
            System.out.println("Move 1th disc from " +  from + " to " + to);
            return;
        }
        towerOfHanoi(n-1, from, aux, to);

        System.out.println("Move " + n + "th disc from " +  from + " to " + to);

        towerOfHanoi(n-1, aux, to, from);
    }

    static int count(int n, String from, String to, String aux)
    {
        if (n == 1)
        {
            int count = 0;
            count += 1;
            return count;
        }
        return count(n-1, from, aux, to) + 1 + count(n-1, aux, to, from);
    }

}
