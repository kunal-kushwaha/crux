package com.codingblocks.mathematics;

import java.io.*;
import java.util.StringTokenizer;

public class Maximums {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
//        int t = in.nextInt();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) throws IOException {
            int n = in.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }
            int[] a = new int[n];
            a[0] = b[0];
            a[1] = b[1] + Math.max(0, a[0]);
            int max = Math.max(a[0], a[1]);
            for (int i = 2; i < n; i++) {
                a[i] = b[i] + max;
                if (a[i] > max) {
                    max = a[i];
                }
            }
            for (int i = 0; i < n; i++) {
                out.print(a[i] + " ");
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
