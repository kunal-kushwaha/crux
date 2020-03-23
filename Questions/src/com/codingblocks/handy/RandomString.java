package com.codingblocks.handy;


import java.util.Random;

public class RandomString {

    private static String generateRandomString(int size) {

        StringBuffer stringBuffer = new StringBuffer(size);

        Random random = new Random();

        for (int i = 0; i < size; i++) {

            int randomChar = 97 + (int)(random.nextFloat() * 26);

            stringBuffer.append((char)randomChar);
        }

        return stringBuffer.toString();
    }

    public static void main(String[] args)
    {
        // size of random alphanumeric string
        int n = 20;
        String name = generateRandomString(3) + "-" + generateRandomString(3) + "-pod";
        // Get and display the alphanumeric string
        System.out.println(name);
    }
}
