package com.codingblocks;

import java.util.ArrayList;

public class ReturnExamples {

    public static void main(String[] args) {

        ArrayList<String> result = numsum("", 4);
        System.out.println(result);

    }

    public static ArrayList<String> subseq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> l1 = subseq(processed + ch, unprocessed.substring(1)); // for accept
        ArrayList<String> l2 = subseq(processed, unprocessed.substring(1)); // for reject

        l1.addAll(l2);
        return l1;
    }

    public static ArrayList<String> asciiSubseq(String processed, String unprocessed){

        if(unprocessed.isEmpty()){

            if(processed.isEmpty()){
                ArrayList<String> list = new ArrayList<>();
                return list;
            }
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> l1 = asciiSubseq(processed + ch, unprocessed.substring(1)); // for accept
        ArrayList<String> l2 = asciiSubseq(processed, unprocessed.substring(1)); // for reject
        ArrayList<String> l3 = asciiSubseq(processed + (ch+0), unprocessed.substring(1));
        l1.addAll(l2);
        l1.addAll(l3);
        return l1;
    }

    public static ArrayList<String> numpad(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = unprocessed.charAt(0) - '0';  // will convert '1' to 1

        ArrayList<String> l = new ArrayList<>();

        // Example: digit = 2, then loop will go from 3 < 6
        for (int i = (digit-1)*3; i < digit*3; i++) {
            if(i == 26){
                continue; // or break, note they are not same.
            }
            char ch = (char) (i + 'a');
            l.addAll(numpad(processed + ch, unprocessed.substring(1)));
        }
        return l;
    }
    public static int numpadCount(String processed, String unprocessed){

        if(unprocessed.isEmpty()){

            return 1;
        }

        int digit = unprocessed.charAt(0) - '0';  // will convert '1' to 1

        int count = 0;

        for (int i = (digit-1)*3; i < digit*3; i++) {
            if(i == 26){
                continue; // or break, note they are not same.
            }
            char ch = (char) (i + 'a');
            count = count + numpadCount(processed + ch, unprocessed.substring(1));
        }
        return count;
    }

    public static ArrayList<String> permutations(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        
        char ch = unprocessed.charAt(0);

        ArrayList<String> l = new ArrayList<>();

        for (int i = 0; i <= processed.length(); i++) {

            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());
            l.addAll(permutations(f+ch+s, unprocessed.substring(1)));
        }
        return l;
    }

    public static int permutationsCount(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            return 1;
        }

        char ch = unprocessed.charAt(0);

        int count = 0;
        for (int i = 0; i <= processed.length(); i++) {

            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());
            count = count + permutationsCount(f+ch+s, unprocessed.substring(1));
        }
        return count;
    }


    public static ArrayList<String> numsum(String processed, int target){   // board

       if(target == 0){
           ArrayList<String> list = new ArrayList<>();
           list.add(processed);
           return list;
       }

        ArrayList<String> l = new ArrayList<>();

        for (int i = 1; i <=6 && i <= target ; i++) {

            l.addAll(numsum(processed + i, target-i));
        }
        return l;
    }

    public static ArrayList<String> facenumsum(String processed, int target, int face){

        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> l = new ArrayList<>();

        for (int i = 1; i <= face && i <= target ; i++) {

            l.addAll(facenumsum(processed + i, target-i, face));
        }
        return l;
    }


}
