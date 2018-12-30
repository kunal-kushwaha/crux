package com.codingblocks.codeLikeItMatters;

import java.text.DecimalFormat;

public class Demo {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.0000000000000");
        System.out.println(df.format(1.234567876543678));

    }
}
