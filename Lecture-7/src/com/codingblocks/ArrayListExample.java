package com.codingblocks;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // Only integer type in array
        ArrayList<Integer> list = new ArrayList<>();


        // autoboxing
        Long a = 545463325464L; // a is object
        Long b = 676423456789747L;
        // OR
//        Integer a = new Integer(54);
        Long c = a + b;

        // here a and b are converted into primitive then added then c is converted into object
        // in this way we get many methods for integers look up by typing b.
        // we still cannot change their values, they are immutable
        // for small values, hashcode returns the value itself

        // hashcode
        // Look up Object class toString

        // for small values hashcode is same as the value
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }
}