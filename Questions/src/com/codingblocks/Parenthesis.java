package com.codingblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class Parenthesis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();

        ArrayList<String> list  = parenR("", str, false);
        for (String s : list) {
            System.out.println(s);
        }

    }

    private static void paren(String processed, String unprocessed, boolean click){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if(ch == '('){
            paren(processed, unprocessed.substring(1), true);
        }
        else if(click){
            if(ch != ')'){
                paren(processed + ch, unprocessed.substring(1), true);
            }else{
                paren(processed, unprocessed.substring(1), false);
            }

        }else{
            paren(processed, unprocessed.substring(1), click);
        }
    }


    private static ArrayList<String> parenR(String processed, String unprocessed, boolean click){

        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> l = new ArrayList<>();

        char ch = unprocessed.charAt(0);

        if(ch == '('){
            l.addAll(parenR(processed, unprocessed.substring(1), true));
        }
        else if(click){
            if(ch != ')'){

                l.addAll(parenR(processed + ch, unprocessed.substring(1), true));
            }else{
                l.addAll(parenR(processed, unprocessed.substring(1), false));
            }
        }else{
            l.addAll(parenR(processed, unprocessed.substring(1), false));
        }
        return l;
    }


}
