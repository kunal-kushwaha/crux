package com.codingblocks.mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DivisibleSubArrays {
    // Solve using pigeon-hole principle - O(N)
    // https://www.youtube.com/watch?v=QQQpOa3aXew

    // Step 1: Find Prefix Sum
    // Step 2: Do arr[i] % N for each element
    // Total size after mod will be N+1 (because we'll take an extra 0 in the front)
    // So, in mod array, unique elements can be atmost N
    // So, atleast one pair exists which has same mod
    // Make frequency Table
    // Suppose 0 comes 4 times and 1 comes 3 times in mod array
    // Ans is 4C2 + 3C2

    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    }
}
