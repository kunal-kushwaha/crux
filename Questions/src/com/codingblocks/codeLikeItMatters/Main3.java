package com.codingblocks.codeLikeItMatters;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        if(N >=1 && N <= 1000){

            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }
            // input done

            mergeSort(arr);

            int count = 0;

            for (int i = 1; i < N; i++) {

                if(arr[i] > arr[i-1]){
                    count++;
                }

            }
            System.out.println(count);
        }
    }

    public static void mergeSort(int[] array)
    {
        if(array == null)
        {
            return;
        }

        if(array.length > 1)
        {
            int mid = array.length / 2;

            int[] left = new int[mid];
            for(int i = 0; i < mid; i++)
            {
                left[i] = array[i];
            }

            int[] right = new int[array.length - mid];
            for(int i = mid; i < array.length; i++)
            {
                right[i - mid] = array[i];
            }
            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while(i < left.length && j < right.length)
            {
                if(left[i] < right[j])
                {
                    array[k] = left[i];
                    i++;
                }
                else
                {
                    array[k] = right[j];
                    j++;
                }
                k++;
            }

            while(i < left.length)
            {
                array[k] = left[i];
                i++;
                k++;
            }
            while(j < right.length)
            {
                array[k] = right[j];
                j++;
                k++;
            }
        }
    }
}
