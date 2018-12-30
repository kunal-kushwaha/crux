package com.codingblocks.interDemo;

public class FixedStack implements IntStack{

    private int[] stack;
    private int top;

    FixedStack(int size){
        stack = new int[size];
        this.top = -1;
    }

    @Override
    public void push(int value) {
        if(top == stack.length - 1){
            System.out.println("Stack is full");
            return;
        }

        stack[++top] = value;
    }

    @Override
    public int pop() {

        if(top == -1){
            System.out.println("Stack is empty");
            return 0;
        }

        return stack[top--];
    }

}
