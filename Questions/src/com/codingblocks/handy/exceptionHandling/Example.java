package com.codingblocks.handy.exceptionHandling;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            try{
                int a = input.nextInt();
                int b = input.nextInt();

                sum += a + b;

                if(a == 0 || b == 0){
                    throw new Exception("a or b is zero");
                }
            }catch (Exception e){
                System.out.println(e);
                System.out.println(e.getMessage());
                sum = 0;
            }
        }
        System.out.println(sum);

    }

}
