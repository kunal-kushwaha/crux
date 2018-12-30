package com.codingblocks.codeLikeItMatters;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int T = input.nextInt();

        String[] names = new String[N];

        ArrayList iqs = new ArrayList();

        for (int i = 0; i < N; i++) {

            String name = input.nextLine();
            int iq = input.nextInt();

            names[i] = name;
            iqs.add(iq);
        }

    }

}
