package com.codingblocks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIO {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        File output = new File("output.txt");
        PrintStream out = new PrintStream(output);

        File input = new File("input.txt");

        Scanner in = new Scanner(input);

        System.out.println(in.nextInt());   // prints in console
        out.println(in.nextInt());          // prints in output.txt

    }



}
