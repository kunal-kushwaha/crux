package com.codingblocks.handy;

import java.text.DecimalFormat;

public class RoundOff {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println(df.format(5.1));

//        System.out.println(String.format("%.5g%n", 0.912385));
//
//        DecimalFormat df = new DecimalFormat("#.####");
//        df.setRoundingMode(RoundingMode.CEILING);
//        for (Number n : Arrays.asList(12, 123.12345, 0.23, 0.1, 2341234.212431324)) {
//            Double d = n.doubleValue();
//            System.out.println(df.format(d));
//        }
    }
}
