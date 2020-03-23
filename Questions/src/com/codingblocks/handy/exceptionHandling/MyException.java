package com.codingblocks.handy.exceptionHandling;

public class MyException extends Exception {

    private int detail;

    public MyException(int a) {
        detail = a;
    }

    public MyException(String message){
        super(message);
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}
