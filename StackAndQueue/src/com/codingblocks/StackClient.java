package com.codingblocks;

import java.util.Scanner;

public class StackClient {

    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println(duplicate(str));

    }


    // Q_4

    public static boolean duplicate(String str) throws Exception{

        StackInteger stack = new StackInteger(str.length());

        for (int i = 1; i < str.length()-1; i++) {

            if(str.charAt(i) != ')'){
                stack.push(str.charAt(i));
            }else{
                int count = 0;
                while(stack.top() != '('){
                    stack.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }
            }
        }
        return false;
    }

}
