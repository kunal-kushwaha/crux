package com.codingblocks;

import java.util.Scanner;

public class Q_10 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();

        System.out.println(freq(l));

    }


    public static String freq(String line){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            int count = 1;

            while(i < line.length() - 1 && line.charAt(i+1) == line.charAt(i)){
                count++;
                i++;
            }
            builder.append(line.charAt(i));
            builder.append(count);
        }
        return builder.toString();
    }


}
