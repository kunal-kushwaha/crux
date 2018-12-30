package com.codingblocks.codeLikeItMatters;

import java.util.Scanner;

public class Main4 {

    static void tds(int[] arr, int n)
    {

        for (int k=1; k<=n; k++)
        {
            int mm = Integer.MIN_VALUE;

            for (int i = 0; i <= n-k; i++)
            {
                int min = arr[i];
                for (int j = 1; j < k; j++)
                {
                    if (arr[i+j] < min)
                        min = arr[i+j];
                }

                if (min > mm)
                    mm = min;
            }

            System.out.print(mm + " ");
        }
    }

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        tds(arr,arr.length);
    }
}
