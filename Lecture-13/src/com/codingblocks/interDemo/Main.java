package com.codingblocks.interDemo;

public class Main {

    public static void main(String[] args) {

        IntStack stack = new FixedStack(10);

        for (int i = 0; i < 10; i++) {
            stack.push(i + 1);
        }
        stack.push(55);


        IntStack stack2 = new DynamicStack(5);

        for (int i = 0; i < 10; i++) {
            stack2.push(i + 1);
        }
        stack2.push(55);
    }
}
