package com.codingblocks.codeLikeItMatters;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int i = input.nextInt();
        int z = input.nextInt();

        double b = x;

        for(int st = 1; st <= i; st = st + 1) {

            Random r = new Random();
            int Low = 10;
            int High = 100;
            int random_val = r.nextInt(High - Low) + Low;

            if (random_val <= z) {
                b = b * 2;
            } else {
                b = b + 1;
            }


            double s = 0;

            while (b % 2 == 0) {
                b = b / 2;
                s = s + 1;
            }

            DecimalFormat df = new DecimalFormat("#.0000000000000");
            System.out.println(df.format(s));
        }
    }
}
