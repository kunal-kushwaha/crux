package com.codingblocks.recursion;

import java.util.*;

public class AllPartitionsPalin {

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
            if(!isPalin(processed)){
                continue;
            }
            ArrayList<String> temp = new ArrayList<>();
            temp.addAll(list);
            temp.add(processed);
            partitions(temp, unprocessed.substring(i));
        }
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
