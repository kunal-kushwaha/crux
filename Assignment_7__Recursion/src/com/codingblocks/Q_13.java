package com.codingblocks;

import java.util.Scanner;

public class Q_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();

        System.out.println(check(false, "", str));
    }

    public static boolean check(boolean result, String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            return result;
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a'){

            if(unprocessed.length() > 2){
                char next = unprocessed.charAt(1);
                if(next == 'a'){
                    return check(true, processed + ch + next, unprocessed.substring(2));

                }else if(next == 'b'){

                    if(unprocessed.length() > 2){
                        char secondB = unprocessed.charAt(2);
                        if(secondB == 'b'){
                            return check(true, processed + ch + next + secondB, unprocessed.substring(3));
                        }else{
                            return check(false, processed + ch + next + secondB, unprocessed.substring(3));
                        }
                    }
                }
            }else if(unprocessed.substring(1).isEmpty())
                return true;

        }else if(ch == 'b') {

            if(unprocessed.length() > 2){
                char secondB = unprocessed.charAt(2);
                if(secondB == 'b'){
                    return check(true, processed + ch + secondB, unprocessed.substring(2));
                }else{
                    return false;
                }
            }
        }

        return false;
    }

}
