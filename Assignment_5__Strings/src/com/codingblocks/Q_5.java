package com.codingblocks;

import java.util.*;

public class Q_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();

        System.out.println(q5(l));

    }

    public static String q5(String line){
        StringBuilder builder = new StringBuilder();

        // add first char of line to builder
        builder.append(line.charAt(0));

        // process each char of line one by one
        for (int i = 1; i < line.length(); i++) {

            // ch for line, last for builder
            char ch = line.charAt(i);
            char last = builder.charAt(builder.length() - 1);

            // get diff
            int diff = Math.abs(last - ch);

            // add at last
            builder.append(diff);
            builder.append(ch);
        }
        return builder.toString();
    }

}
