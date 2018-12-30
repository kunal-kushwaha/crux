package com.codingblocks;

public class StackClient {
    public static void main(String[] args) throws Exception{

        DynamicStack stack = new DynamicStack();

        for (int i = 0; i < 10000; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 10000; i++) {
            System.out.println("Popped " + stack.pop());
        }

    }


}
