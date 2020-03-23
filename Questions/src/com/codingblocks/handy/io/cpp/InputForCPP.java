package com.codingblocks.handy.io.cpp;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputForCPP {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = s.nextInt();
        System.out.println(t);
    }
}
