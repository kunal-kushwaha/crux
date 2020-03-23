package com.codingblocks.handy.generics;

public class GenericIntro {
    public static void main(String args[]) {
        BasicGeneric<String> str1 = new BasicGeneric<>(new String("Hello"));
        System.out.println(str1);
        str1.displayReference();

        str1.showType();

        BasicGeneric<String> str2 = new BasicGeneric<>("World");
        str2.displayReference();

        BasicGeneric<Integer> i1 = new BasicGeneric<>(new Integer(41));
        i1.displayReference();

        BasicGeneric<Integer> i2 = new BasicGeneric<>(1024);
        i2.displayReference();

        BasicGeneric<Boolean> b1 = new BasicGeneric<>(new Boolean("true"));
        b1.displayReference();

        BasicGeneric<Object> o1 = new BasicGeneric<>(new Object());
        o1.displayReference();
    }
}

class BasicGeneric<T> {
    T refVariable;
    BasicGeneric(T param) {
        refVariable = param;
    }
    void displayReference() {
        System.out.println(refVariable);
    }

    void showType(){
        System.out.println("Type : " + refVariable.getClass().getName());
    }
}