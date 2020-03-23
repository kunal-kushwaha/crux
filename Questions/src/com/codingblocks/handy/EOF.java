package com.codingblocks.handy;

import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        while(input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(count++ + " " + line);
        }
    }
}
