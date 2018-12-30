package com.codingblocks;

public class Stack {

    private char[] data;

    private static int DEFAULT_SIZE = 10;

    int top = -1;

    public Stack(){
       this(DEFAULT_SIZE);
    }
    public Stack(int size){
        data = new char[size];
    }

    public boolean push(char item){
        if(isFull()){
            return false;
        }

        top++;
        data[top] = item;   // OR    data[++top] = item;
        return true;
    }

    public char pop() throws Exception{
        if(isEmpty()){
            throw new StackException("Cannot pop from empty stack");
        }
        return data[top--];
    }

    public char top() throws Exception{
        if(isEmpty()){
            throw new StackException("Stack is empty!");
        }
        return data[top];

    }

    public boolean isEmpty(){
        return top == -1;   // OR return top < 0
    }

    private boolean isFull(){
        return top == data.length - 1;
    }

    public void display() {

        for (int i = 0; i <= top; i++) {
            System.out.print(data[i]);
        }
    }

}
