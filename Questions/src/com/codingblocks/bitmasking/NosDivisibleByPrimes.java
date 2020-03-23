package com.codingblocks.bitmasking;

import java.io.*;
import java.util.StringTokenizer;

public class NosDivisibleByPrimes {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        int t = in.nextInt();
        solver.solve(t, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) throws IOException {
            for (int i = 0; i < testNumber; i++) {
                int n = in.nextInt();
                int[] primes = {2,3,5,7,11,13,17,19};
                int res = 0;
                for (int k = 1; k < Math.pow(2, primes.length); k++) {
                    int sig = n;
                    int msb = 0;
                    int j = k;
                    int count = 0;
                    while(j > 0) {
                        if ((j & 1) == 1){
                            sig = sig / primes[msb];
                            count++;
                        }
                        msb++;
                        j = j >> 1;
                    }
                    if (count % 2 == 0) {
                        res -= sig;
                    } else {
                        res += sig;
                    }
                }
                System.out.println(res);
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
