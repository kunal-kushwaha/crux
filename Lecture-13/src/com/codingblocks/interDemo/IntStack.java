package com.codingblocks.interDemo;

public interface IntStack {

    void push(int value);
    int pop();

    static void show(){
        System.out.println("Running from B");
    }
}
