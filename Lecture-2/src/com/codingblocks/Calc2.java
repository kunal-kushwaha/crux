package com.codingblocks;

import java.util.Scanner;

public class Calc2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String st = input.nextLine();
//        char operation = st.charAt(0);

        char operation = input.next().trim().charAt(0);

        while(operation != 'X' && operation!='x'){

            if (operation == '+') {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println(num1 + num2);
            }
            else if  (operation == '-') {
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                System.out.println(num1 - num2);
            }
            else if (operation == '/') {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if(num2 != 0)
                    System.out.println(num1 / num2);
                else{
                    System.out.println("Invalid operation. Try again.");
                }
            }
            else if (operation == '*'){
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println(num1 * num2);
            }
            else if (operation == '%'){
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println(num1 % num2);
            }
            else
                System.out.println("Invalid operation. Try again.");
                operation = input.next().trim().charAt(0);

        }
    }
}

