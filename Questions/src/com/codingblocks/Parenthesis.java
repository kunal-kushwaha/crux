package com.codingblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class Parenthesis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();

        ArrayList<String> list  = parenR("", str, false);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static void paren(String processed, String unprocessed, boolean click){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if(ch == '('){
            paren(processed, unprocessed.substring(1), true);
        }
        else if(click == true){

            if(ch != ')'){

                paren(processed + ch, unprocessed.substring(1), click);
            }else{
                paren(processed, unprocessed.substring(1), false);
            }

        }else{
            paren(processed, unprocessed.substring(1), click);
        }
    }


    public static ArrayList parenR(String processed, String unprocessed, boolean click){

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
        else if(click == true){

            if(ch != ')'){

                l.addAll(parenR(processed + ch, unprocessed.substring(1), click));
            }else{
                l.addAll(parenR(processed, unprocessed.substring(1), false));
            }

        }else{
            l.addAll(parenR(processed, unprocessed.substring(1), click));
        }
        return l;
    }


}
