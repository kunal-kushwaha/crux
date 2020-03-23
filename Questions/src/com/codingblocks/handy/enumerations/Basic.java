package com.codingblocks.handy.enumerations;

public class Basic {

    enum Apple{
        Jonathan, GoldenDel, RedDel, Winesap, Cortland

        // The identifiers Jonathan, GoldenDel, and so on, are called enumeration constants.
        // Each is implicitly declared as a public, static final member of Apple.
        // Since it is static, we can access it by using enum Name. i.e. Apple.Winesap, etc.
        // Since it is final, we can’t create child enums.
        // Furthermore,their type is the type of the enumeration in which they are declared,which is Apple in this case.

    }

    public static void main(String[] args) {

        Apple ap;
        ap = Apple.Winesap;

        for(Apple a : Apple.values()){
            System.out.println(a);
        }

        System.out.println(ap); // Winesap

        System.out.println(Apple.valueOf("Jonathan"));  // Jonathan

        System.out.println(ap.ordinal());   // 3


    }
}
