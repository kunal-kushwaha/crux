package com.codingblocks;

// Shadowing refers to the practice in Java of using two variables with the same name within scopes that overlap.
// When you do that, the variable with the higher-level scope is hidden because the variable with
// lower-level scope overrides it. The higher-level variable is then “shadowed”.

public class Shadowing {
    static int x;
    public static void main(String[] args) {
        x = 5;
        System.out.println("x = " + x); // prints the value of the class variable x
        int x;  // the class variable x is shadowed by this local variable x
        x = 10;
        System.out.println("x = " + x); // prints local variable x
        System.out.println("Shadowing.x = " + Shadowing.x); // prints the shadowed class variable
    }
}
// The scope of a local variable that shadows a class variable doesn’t necessarily begin at the same point that the
// local variable’s scope begins. The shadowing begins when the local variable is declared, but the local variable’s
// scope doesn’t begin until the variable is initialized. If you attempt to access the variable between the declaration
// and the initialization, the Java compiler displays an error message.