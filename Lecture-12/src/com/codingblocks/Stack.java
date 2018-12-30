package com.codingblocks;

public class Stack {

    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    int top = -1;

    public Stack(){
        this(DEFAULT_SIZE);
    }

    public Stack(int size){
        this.data = new int[size];
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
            throw new Exception("Cannot pop from empty stack");
        }
        return data[top--];
    }

    public int top() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from empty stack");
        }
        return data[top];

    }

    public boolean isEmpty(){
        return top == -1;   // OR return top < 0
    }

    public boolean isFull(){
        return top == data.length - 1;
    }

}
