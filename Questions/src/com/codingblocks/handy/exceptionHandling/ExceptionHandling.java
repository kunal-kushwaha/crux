package com.codingblocks.handy.exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        try{
            int num = a / b;
            System.out.println("This will not be printed if b is 0");
            // catch is not “called,” so execution never “returns” to the try block from a catch.
            // Thus, the line "This will not be printed if b is 0"

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Cannot divide by 0");
        }finally{
            System.out.println("This will always be printed");
        }
    }
}
