package com.codingblocks;

public abstract class Engine {

    public int acc_speed = 2;

    public String name = "kunal";
    public void start(){
        System.out.println("I start Generic");
    }
    public void stop(){
        System.out.println("I stop Generic");
    }
    public void acc(){
        System.out.println("I acc Generic with " + this.acc_speed);
    }

    // Function Overloading: Compile Time polymorphism (Overloading)
    public int acc(int acc_speed){
        System.out.println("I acc Generic with " + acc_speed);
        return acc_speed;
    }

    // Abstract class means object of class cannot be created
    // body is empty
    // abstract methods
    public abstract void crash();

    // static methods cannot be overriden
    public static void khamba(){
        System.out.println("I am khamba of Engine");
    }

}
