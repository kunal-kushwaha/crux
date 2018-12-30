package com.codingblocks;

public class Q_6 {

    public static void main(String[] args) {

    }

    public static void subseq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        subseq(processed + ch, unprocessed.substring(1)); // for accept
        subseq(processed, unprocessed.substring(1)); // for reject
    }

}
