package com.codingblocks;

public class StackInteger {

    private int[] data;

    private static int DEFAULT_SIZE = 10;

    int top = -1;

    public StackInteger() {
        this(DEFAULT_SIZE);
    }

    public StackInteger(int size) {
        data = new int[size];
    }

    public int size(){
        return data.length;
    }

    public boolean push(int item) {
        if (isFull()) {
            return false;
        }

        top++;
        data[top] = item;   // OR    data[++top] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new StackException("Cannot pop from empty stack");
        }
        return data[top--];
    }

    public int top() throws Exception {
        if (isEmpty()) {
            throw new StackException("Stack is empty!");
        }
        return data[top];

    }

    private boolean isEmpty() {
        return top == -1;   // OR return top < 0
    }

    private boolean isFull() {
        return top == data.length - 1;
    }

    public void display() {

        for (int i = 0; i <= top; i++) {
            System.out.print(data[i] + " ");
        }
    }


}