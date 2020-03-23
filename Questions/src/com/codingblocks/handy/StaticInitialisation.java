package com.codingblocks.handy;

import java.util.Scanner;

public class StaticInitialisation {

    static int B;
    static int H;
    static boolean flag = false;

    static {
        Scanner s = new Scanner(System.in);

        H = s.nextInt();
        B = s.nextInt();

        if(B >= 0 && H >= 0){
            flag = true;
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){

        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

