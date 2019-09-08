package com.codingblocks.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputForCPP {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = s.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = s.nextInt();
            String num = n + "";
            String num1 = "";
            String num2 = "";
            for (int j = 0; j < num.length(); j++) {
                if(num.charAt(j) == '4'){
                    num1 += '3';
                    num2 += '1';
                }else{
                    num1 += num.charAt(j);
                    num2 += 0;
                }
            }
            System.out.println("Case #" + i + ": " + Integer.valueOf(num1).toString() + " " + Integer.valueOf(num2).toString());
        }
        s.close();


        // OR
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
    }
}
