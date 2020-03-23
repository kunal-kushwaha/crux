package com.codingblocks.handy.enumerations;

public class Example {

    enum Color{
        Red, Blue, Green;

        // And the constructor cannot be the public or protected it must have private or default modifiers.
        // Why? if we create public or protected, it will allow initializing more than one objects.
        // This is totally against enum concept.

        Color() {
            System.out.println("Constructor of : " + this.toString());
        }
    }

    public static void main(String[] args) {

        Color myCol = Color.Blue; // Constructor ran for all enum constants
    }
}
