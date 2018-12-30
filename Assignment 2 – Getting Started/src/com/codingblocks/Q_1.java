package com.codingblocks;
import java.util.Scanner;
public class Q_1 {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int c =2;

        while(c*c < num){
            if(num%c==0){
                System.out.println("Not Prime (inside)");
                break;
            }
            c++;
        }
        if(c*c > num){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
