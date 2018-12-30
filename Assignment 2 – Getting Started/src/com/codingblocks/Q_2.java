package com.codingblocks;
import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 2;
        int i = 0;
        int p = 1;
        int temp = 0;
        while(count <= n){
            temp = p;
            p = p + i;
            i = temp;
            count++;
        }
        System.out.println(p);
    }
}
