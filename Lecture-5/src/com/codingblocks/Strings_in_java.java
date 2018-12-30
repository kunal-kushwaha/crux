package com.codingblocks;

public class Strings_in_java {

    public static void main(String[] args) {
        String line = "Hello";

//        String second = "World";

        String second = "Hello";
        System.out.println(line == second); // may show true or false, because Java may use the old line reference for
        // the "World" in second = "World" or it may create a new reference second
        // means don't compare like this.
//        Instead
        System.out.println(line.equals(second));
//        line = line + second;
        // new string created and reference of new string passed to the reference 'line'


        line = line + second;
        System.out.println(line.substring(2, 4));  // substring(start, end) end is exclusive, will not be included.
        System.out.println();
        System.out.println(line);
        System.out.println(line.length());
        System.out.println(line.charAt(0));
//        System.out.println(line[0]);   // Error
        display(line);
        substrings(line);

        // To print the index of a character
        System.out.println(line.indexOf('e')); // 1
        System.out.println(line.indexOf('i')); // -1
        System.out.println(line.indexOf('l', 3));

        String line2 = "Hello I am James Bond";
        System.out.println(line2.indexOf('o', 1));
        System.out.println(line2.startsWith("Hello"));   // true
        System.out.println(line2.startsWith("I", 6)); // Means the pattern will be checked from 6
        System.out.println("Ends with Bond: " + line2.endsWith("Bond"));
        line = "Hello World";
        System.out.println("Codepoint");
        System.out.println(line.codePointAt(3));    // gives uni code value

        System.out.println("Locations: ");
        String line3 = "Hello my name is bond";
        locations(line3, "o");


        // COMPARING STRINGS

        String one = "a";
        String two = "b";

        int result = one.compareTo(two);    // -1 if one < two
                                            // 1 if one > two
                                            // 0 if one = two

    }

    public static void display(String line){
        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i) + ", ");
        }
    }

    public static void substrings(String line){

        for (int i = 0; i < line.length() ; i++) {
            for (int j = i+1; j <= line.length(); j++) {
                System.out.println(line.substring(i,j));
            }
        }
    }

    public static void locations(String line, String pattern){
        int start = 0;

        while(true){
            int loc = line.indexOf(pattern, start);
            if(loc == -1)
                break;
            System.out.println(loc);
            start = loc + 1;
        }
    }

    public static boolean isPallin(String line){

        line = line.toLowerCase();
        for (int i = 0; i <=line.length()/2 ; i++) {
            if(line.charAt(i) != line.charAt(line.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
