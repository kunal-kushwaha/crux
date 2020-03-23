package com.codingblocks.handy.exceptionHandling;

public class ChainExcDemo {

    static void demoproc() {
        // create an exception
        NullPointerException e =
                new NullPointerException("top layer");
        // add a cause
        e.initCause(new ArithmeticException("cause"));
//        e.initCause(new ArithmeticException("cause"));    // ERROR! Can set cause only once for each object
        throw e;
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            // display top level exception
            System.out.println("Caught: " + e);
            // display cause exception
            System.out.println("Original cause: " + e.getCause());
        }
    }

}
