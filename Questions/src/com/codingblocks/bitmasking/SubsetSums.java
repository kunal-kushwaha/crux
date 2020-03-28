package com.codingblocks.bitmasking;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SubsetSums {
    static int a, b;
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
            a = in.nextInt();
            b = in.nextInt();
            int[] s1 = new int[n/2];
            int[] s2 = new int[n - n/2];
            for (int i = 0; i < s1.length; i++) {
                s1[i] = in.nextInt();
            }
            for (int i = 0; i < s2.length; i++) {
                s2[i] = in.nextInt();
            }
            Integer[] left = subsets(s1);
            Integer[] right = subsets(s2);

            Arrays.sort(left);
            Arrays.sort(right);

//            System.out.println(Arrays.toString(left));
//            System.out.println(Arrays.toString(right));
//            System.out.println();

            int ans = 0;

            for (int i = 0; i < left.length; i++) {
                int low = a - left[i];
                int high = b - left[i];

//                System.out.println(low + " " + high);
                int l1 = lowerBound(right, low);
                int l2 = lowerBound(right, high);

//                System.out.println(l1 + " " + l2);

                if (l2 < right.length) {
                    if (right[l2] == high) {
                        l2 += 1;
                    }
                }
                ans += (l2 - l1);
//                System.out.println();
            }
            System.out.println(ans);
        }

        public static int lowerBound(Integer[] array, int value) {
            int low = 0;
            int high = array.length;
            while (low < high) {
                final int mid = (low + high) / 2;
                //checks if the value is less than middle element of the array
                if (value <= array[mid]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }

        public static Integer[] subsets(int[] arr) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < (1 << arr.length); i++) {
                int sum = 0;
                int msb = 0;
                int j = i;
                while(j > 0) {
                    if ((j & 1) == 1){
                        sum += arr[msb];
                    }
                    msb++;
                    j = j >> 1;
                }
                list.add(sum);
            }
            Integer[] res = new Integer[list.size()];
            res = list.toArray(res);
            return res;
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

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
