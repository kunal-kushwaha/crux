package com.codingblocks;

public class Q_5 {

    public static void main(String[] args) {
        temp(0, 100, 20);
    }

    public static void temp(int min_f, int max_f, int step){
        for (int i = min_f; i < max_f; i += step) {
            float c = 5f/9 * (i - 32);
            System.out.println(i + "  :  " + c);
        }
    }
}
