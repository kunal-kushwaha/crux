package com.codingblocks.stacksNqueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class JumpingFromTowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        int N = input.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        Stack<List<Integer>> start = new Stack<>();
        long count = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!start.empty() && start.peek().get(0) < arr[i]) {
                start.pop();
            }
            if (!start.empty() && start.peek().get(0) == arr[i]) {
                count += start.peek().get(1);
                start.peek().set(1, start.peek().get(1) + 1);
            } else {
                List<Integer> StartNew = new ArrayList<>(2);
                StartNew.add(arr[i]);
                StartNew.add(1);    // for adding in count
                start.push(StartNew);
            }
        }
        System.out.println(count * 2);
    }
}
