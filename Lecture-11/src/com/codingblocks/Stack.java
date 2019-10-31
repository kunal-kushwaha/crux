package com.codingblocks;

import java.lang.reflect.Executable;

public class Stack {

    private int[] data;

    private static final int DEFAULT_SIZE = 10;

    int top = -1;

    public Stack(){
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean push(int item){
        if(isFull()){
            return false;
        }

        top++;
        data[top] = item;   // OR    data[++top] = item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new StackException("Cannot pop from empty stack");
        }
        return data[top--];
    }

    public int top() throws Exception{
        if(isEmpty()){
            throw new StackException("Stack is empty!");
        }
        return data[top];

    }

    private boolean isEmpty(){
        return top == -1;   // OR return top < 0
    }

    private boolean isFull(){
        return top == data.length - 1;
    }

}