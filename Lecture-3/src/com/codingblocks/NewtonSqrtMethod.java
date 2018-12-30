package com.codingblocks;

import java.util.Scanner;

public class NewtonSqrtMethod {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if(N >= 0 && N < 1000000000){

            int result = (int)(sqrtMethod(N));
            System.out.println(result);

        }
    }

    public static float sqrtMethod(float N)
    {
        float sqrt = 0;
        float temp = 0;

        temp = N/2;

        while (N >= 0.0)
        {
            sqrt = temp - (temp * temp - N) / (2 * temp);

            float value;
            value = Math.abs(temp - sqrt);

            if (value < .0001)
                return sqrt;
            else temp = sqrt;
        }

        return N;
    }
}
