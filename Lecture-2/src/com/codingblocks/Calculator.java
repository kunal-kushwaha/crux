package com.codingblocks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Scanner reader = new Scanner(System.in);

        while(true){
            char operation = reader.next().trim().charAt(0);

            if(operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%'){
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (operation == '+') {
                    System.out.println(num1 + num2);
                }
                if  (operation == '-') {
                    System.out.println(num1 - num2);
                }

                if (operation == '/') {
                    if(num2 != 0)
                        System.out.println(num1 / num2);
                    else{
                        System.out.println("Invalid operation. Try again.");
                    }
                }

                if (operation == '*'){
                    System.out.println(num1 * num2);
                }

                if (operation == '%'){
                    System.out.println(num1 % num2);
                }

                if(operation == 'X' || operation=='x')
                    break;
            }else{
                System.out.println("Invalid operation. Try again.");
            }
        }
    }
}
