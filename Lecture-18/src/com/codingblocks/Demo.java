package com.codingblocks;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,8};
        String str = Arrays.toString(arr).replaceAll(", ", "");
        long ans = Integer.parseInt(str.substring(1, str.length()-1));
        System.out.println(ans);
    }


}

