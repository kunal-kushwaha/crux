package com.codingblocks.handy.exceptionHandling;

public class NestedTry {
    public static void main(String[] args) {
        int a =10;
        int b = 2;

        try{
            int c = a / b;
            try{
                int d = c / (b - 2);
                // In this the ArithmeticException is not specified so it will look in the outer try-catch.
            }catch(IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
