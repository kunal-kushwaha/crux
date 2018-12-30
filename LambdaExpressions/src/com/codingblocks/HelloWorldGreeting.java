package com.codingblocks;

public class HelloWorldGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("Hello World!");
    }
    public void display(){
        System.out.println("display function ran");
    }
}
