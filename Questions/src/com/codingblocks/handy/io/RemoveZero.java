package com.codingblocks.handy.io;

public class RemoveZero {
    public static String removeZero(String str) {
        // Count leading zeros
        int i = 0;
        while (str.charAt(i) == '0')
            i++;

        // Convert str into StringBuffer as Strings
        // are immutable.
        StringBuffer sb = new StringBuffer(str);

        // The StringBuffer replace function removes
        // i characters from given index (0 here)
        sb.replace(0, i, "");

        return sb.toString(); // return in String
    }

    // Driver code
    public static void main (String[] args) {
        String str = "00000123569000";
        str = removeZero(str);
        System.out.println(str);
    }

}


