package com.codingblocks;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int[] arr2 = Arrays.copyOfRange(arr, 1, 5);
        System.out.println(Arrays.toString(arr2));

    }


}
