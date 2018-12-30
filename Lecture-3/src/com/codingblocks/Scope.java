package com.codingblocks;

public class Scope {
    public static void main(String[] args) {
        int a= 10;
        int b = 20;

        swap(a, b);
        // note nothing will happen here because the real value didn't change.
        // because this will not pass the reference of a and b, instead it will pass the values of a and b.
        // because the scope of variables of the function swap() will be defined in swap only.
        // Only for primitive datatypes i.e. Ints, chars etc. In non-primitive datatypes, ex: Arrays,
        // reference is passed in argument, hence value changes.
        System.out.println(a);
        System.out.println(b);

        {
//            int a = 56;         // can't do this in java, can do in C
            // because a is initialized in it's block, and this function is in the block of a

            a = 56; // can do this
            int c = 345;
            System.out.println(c);
        }
//        System.out.println(c);     // error
        // No shadowing effect in methods
        // no pointers effect in java
        // only pass by value in methods for primitve datatypes.

        // can do this too because i is initialized in it's own block of for loop.
//        for (int i = 0; i < ; i++) {
//
//        }
//
//        for (int i = 0; i < ; i++) {
//
//        }

    }
    // cursor on 'swap(a, b);' and alt + enter to create a new function as below:
    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
