package com.codingblocks.handy.io.cpp;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputForCPP2 {

    public static void main(String[] args) throws IOException {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        // OUTPUT
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(String.valueOf(n));
        bufferedWriter.write('\n' + name);
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
