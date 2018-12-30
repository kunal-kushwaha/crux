package com.codingblocks.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        ArrayList<Integer> processed = new ArrayList<>();
        ArrayList<Integer> unprocessed = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = input.nextInt();
            unprocessed.add(num);
        }

        System.out.println(subArrayC(processed, unprocessed, 0,0));
        subArray(processed, unprocessed, 0);

    }

    public static void subArray(ArrayList<Integer> processed, ArrayList<Integer> unprocessed, int last){

        if(unprocessed.isEmpty()){
            return;
        }

        if(processed.size() > 0 && unprocessed.size() > 0){

            if(sum(processed) == sum(unprocessed)){
                display(processed);
                System.out.print(" and ");
                display(unprocessed);
                System.out.println();
            }
        }

        for (int i = last; i < unprocessed.size(); i++) {

            int num = unprocessed.get(i);

            ArrayList<Integer> new_processed = new ArrayList<>();

            new_processed.addAll(processed);
            new_processed.add(num);


            ArrayList<Integer> new_unprocessed = new ArrayList<>();

            new_unprocessed.addAll(unprocessed);
            new_unprocessed.remove(i);

            subArray(new_processed, new_unprocessed, i);

        }

    }

    public static int subArrayC(ArrayList<Integer> processed, ArrayList<Integer> unprocessed, int last, int count){

        if(unprocessed.isEmpty()){
            return count;
        }

        if(processed.size() > 0 && unprocessed.size() > 0){

            if(sum(processed) == sum(unprocessed)){

                count  = count +1;

            }
        }

        for (int i = last; i < unprocessed.size(); i++) {

            int num = unprocessed.get(i);

            ArrayList<Integer> new_processed = new ArrayList<>();

            new_processed.addAll(processed);
            new_processed.add(num);


            ArrayList<Integer> new_unprocessed = new ArrayList<>();

            new_unprocessed.addAll(unprocessed);
            new_unprocessed.remove(i);

            count =  subArrayC(new_processed, new_unprocessed, i, count);

        }
        return count;

    }

    public static int sum(ArrayList<Integer> nums){


        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {

            sum = sum + nums.get(i);
        }

        return sum;
    }

    public static void display(ArrayList<Integer> nums){
        for (int i = 0; i < nums.size()-1; i++) {

            System.out.print(nums.get(i) + ", ");

        }
        System.out.print(nums.get(nums.size()-1));
    }

}
