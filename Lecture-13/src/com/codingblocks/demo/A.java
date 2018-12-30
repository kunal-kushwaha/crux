package com.codingblocks.demo;

public interface A {

    default void display(){
        System.out.println("Hello A World");
    }

    static void show(){
        System.out.println("Running from A");
    }
}
