package com.codingblocks;

public class Q_7 {

    public static void main(String[] args) {

    }

    public static void permutations(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {        // i <= processed.length() because there will be
            // length+1 cases in which we can place ch. for example: 4 places in abc.

            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());
            permutations(f+ch+s, unprocessed.substring(1));
        }
    }
}
