package com.codingblocks.interDemo;

public class DynamicStack implements IntStack{

    private int[] stack;
    private int top;

    DynamicStack(int size){
        stack = new int[size];
        top = -1;
    }

    @Override
    public void push(int value) {
        if(top == stack.length - 1){

            int[] temp = new int[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }

            stack = temp;
            stack[++top] = value;
        }
        stack[++top] = value;
    }

    @Override
    public int pop() {
        if(top == -1){
            System.out.println("Stack underflow");
            return 0;
        }
        return stack[top--];
    }
}
