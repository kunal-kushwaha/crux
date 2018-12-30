package com.codingblocks.demo;

public interface B extends A {

    default void display(){
//        A.super.display();
        System.out.println("Hello B World");
    }
}
