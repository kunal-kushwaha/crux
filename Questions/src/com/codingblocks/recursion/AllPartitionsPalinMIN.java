package com.codingblocks.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPartitionsPalinMIN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();

        ArrayList<String> list = new ArrayList<>();

        int min = Integer.MAX_VALUE;

        ArrayList<ArrayList<String>> l = partitions(list, str);

        for(ArrayList t : l){
            if(t.size() < min){
                min = t.size();
            }
        }
        System.out.println(min);

    }

    public static ArrayList<ArrayList<String>> partitions(ArrayList<String> list, String unprocessed){

        if(unprocessed.isEmpty()){
            ArrayList<ArrayList<String>> l = new ArrayList<>();
            l.add(list);
            System.out.println(list);
            System.out.println();
            return l;
        }

        ArrayList<ArrayList<String>> l = new ArrayList<>();

        for (int i = 1; i <= unprocessed.length() ; i++) {

            String processed = unprocessed.substring(0,i);
            if(!isPalin(processed)){
                continue;
            }
            ArrayList<String> temp = new ArrayList<>();
            temp.addAll(list);
            temp.add(processed);
            l.addAll(partitions(temp, unprocessed.substring(i)));
        }
        return l;
    }

    public static boolean isPalin(String str){
        return isPalin(0, str.length() - 1, str);
    }

    private static boolean isPalin(int beg, int last, String str){

        if(beg > last){
            return true;
        }

        return str.charAt(beg) == str.charAt(last) && isPalin(beg + 1, last - 1, str);
    }
}
