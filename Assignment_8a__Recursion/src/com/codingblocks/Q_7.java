package com.codingblocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        int target = input.nextInt();
        // input done

        ArrayList list = new ArrayList();
        subset("", arr, target);

    }

    public static void subset(String processed, int[] arr, int target){

        if(target == 0){
            System.out.println(processed);
            return;
        }

        int num = arr[0];
        if(arr.length > 1){
            if(arr[0] <= target) {

                subset(processed + num + " ", Arrays.copyOfRange(arr, 1, arr.length), target - arr[0]);
                subset(processed, Arrays.copyOfRange(arr, 1, arr.length), target);
            }
        }
    }

    public static void subsetAL(ArrayList list, int[] arr, int target){

        if(target == 0){
            display(list);
            return;
        }

        int num = arr[0];
        if(arr.length > 1){
            if(arr[0] <= target) {
                ArrayList new_list = new ArrayList();
                new_list.addAll(list);
                new_list.add(num);
                subsetAL(new_list, Arrays.copyOfRange(arr, 1, arr.length), target - arr[0]);
                subsetAL(list, Arrays.copyOfRange(arr, 1, arr.length), target);
            }
        }
    }

    public static void display(ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
