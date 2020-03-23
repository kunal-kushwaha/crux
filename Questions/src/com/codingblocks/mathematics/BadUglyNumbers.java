package com.codingblocks.mathematics;

import java.io.*;
import java.util.StringTokenizer;

public class BadUglyNumbers {
     public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        int t = in.nextInt();
        solver.solve(t, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) throws IOException {
            for (int i = 0; i < testNumber; i++) {
                int n = in.nextInt();
                if (n==1) {
                    System.out.println(-1);
                    continue;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("2");
                for (int j = 0; j < n - 1; j++) {
                    sb.append("3");
                }
                String s = sb.toString();
                System.out.println(s);
            }
        }
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
        public long nextLong() {
            return Long.parseLong(next());
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public char nextChar() {
            return next().charAt(0);
        }
        public String nextLine() throws IOException {
            return reader.readLine().trim();
        }
    }
}
