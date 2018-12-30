package com.codingblocks;

public class PetrolEngine extends Engine {

    public int acc_speed = 3;

    // No operator overloading in java. Cannot add 2 or more objects

    // Function Overriding: Runtime Polymorphism (Overriding)
    // Write 'final' after method so that it cannot be overridden
    @Override   // Makes previous function as Virtual function
    // @Override is just to detect if function cannot be overriden. It can also work without writing @Override
    public void start(){    // Parameters should be same
        System.out.println("Now I Start with Petrol " + super.acc_speed); // uses acc_speed of Parent class
        System.out.println("Now I Start with Petrol " + this.acc_speed); // uses acc_speed of current class (PetrolEngine)
    }

    @Override
    public void crash() {
        System.out.println("Crash Override");
    }

    public void makeNoise(){
        System.out.println("Phat Phat Phat");
    }

    // static methods cannot be overriden but can be extended,
    // Same thing happens with variables
    public static void khamba(){
        System.out.println("I am khamba of PetrolEngine");
    }
}
