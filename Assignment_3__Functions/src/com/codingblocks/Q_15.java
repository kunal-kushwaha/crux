package com.codingblocks;
import java.util.Scanner;
public class Q_15 {

    public static void main(String[] args) {
        series();
    }

    public static void series(){

        Scanner s = new Scanner(System.in);
        int N1 = s.nextInt();
        int N2 = s.nextInt();

        if(N1 < 0 || N1 >= 100 || N2 < 0 || N2 >= 100)
        {
            System.out.println("Invalid input.");
            return;
        }

        for(int n = 1; N1 > 0; n++)
        {
            int value = 3*n+2;
            if (value % N2 != 0)
            {
                System.out.println(value);
                N1--;
            }
        }
    }
}
