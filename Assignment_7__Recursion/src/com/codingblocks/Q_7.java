package com.codingblocks;

import java.util.Scanner;

public class Q_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        move("","", str);
    }

    public static void move(String normal, String xes, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(normal + xes);
            return;
        }

        char ch = unprocessed.charAt(0);
        if(ch == 'x'){
            move(normal, xes + ch, unprocessed.substring(1));
        }else{
            move(normal + ch, xes, unprocessed.substring(1));
        }
    }
}
