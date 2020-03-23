package com.codingblocks.handy;

import java.util.ArrayList;
import java.util.Arrays;

public class Split {

    public static void main(String[] args) {

        String str = "Kunal, Rahul, Apoorv, Farhaan";

        String[] names = str.split(",");
        System.out.println(Arrays.toString(names));

        ArrayList<Integer> list = new ArrayList<>();


    }
}
