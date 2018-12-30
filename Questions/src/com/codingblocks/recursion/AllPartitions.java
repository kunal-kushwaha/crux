package com.codingblocks.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPartitions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();

        ArrayList<String> list = new ArrayList<>();

        partitions(list, str);

    }

    public static void partitions(ArrayList<String> list, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(list);
            return;
        }

        for (int i = 1; i <= unprocessed.length() ; i++) {

            String processed = unprocessed.substring(0,i);
            ArrayList<String> temp = new ArrayList<>();
            temp.addAll(list);
            temp.add(processed);
            partitions(temp, unprocessed.substring(i));
        }
    }





}
