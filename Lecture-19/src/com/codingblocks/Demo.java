package com.codingblocks;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = a;
        a[0] = 5;   // Will change b also
        System.out.println(Arrays.toString(b));
    }

}
