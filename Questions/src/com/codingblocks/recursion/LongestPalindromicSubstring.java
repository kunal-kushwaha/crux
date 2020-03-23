package com.codingblocks.recursion;

import java.io.*;
import java.util.StringTokenizer;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        private String s;
        String ans;
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            s = in.next();
            ans = substr(s);
            out.println(ans);
        }
    }

    static String substr(String s) {
        if (s.isEmpty()) {
            return "";
        }
        String max = "";
        for (int j = 0; j < s.length(); j++) {
            String sub = s.substring(0, j+1);
            if (isPalin(sub)) {
                if (sub.length() > max.length()) {
                    max = sub;
                }
            }
        }
        String etc = substr(s.substring(1));
        if (etc.length() > max.length()) {
           return etc;
        }
        return max;
    }


    static boolean isPalin(String s) {
        int end = s.length() - 1;
        for (int i=0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(end)) {
                return false;
            }
            end -= 1;
        }
        return true;
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }

}

