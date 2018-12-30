package com.codingblocks;

public class Q_20 {
    public static void main(String[] args) {
        calculator(2,3,'x');
    }

    public static void calculator(int a, int b, char ch){

        while(ch != 'x' || ch != 'X'){

            if(ch == '+'){
                System.out.println(a + b);
                break;
            }

            else if (ch == '-'){
                System.out.println(a - b);
                break;
            }

            else if (ch == '*'){
                System.out.println(a * b);
                break;
            }

            else if (ch == '/'){
                System.out.println(a / b);
                break;
            }

            else if (ch == '%'){
                System.out.println(a % b);
                break;
            }
        }
    }
}
