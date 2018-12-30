package com.codingblocks;

public class StackOptimized {

    private StackInteger first;
//    private StackInteger second;

    int min;

    StackOptimized(int size){
        first = new StackInteger(size);
    }

    public int size(){
        return first.size();
    }
    public void push(int item){
        if(min > item){
            min = item;
        }
        first.push(item);
    }

    public int pop() throws Exception{
        return first.pop();
    }

    public int getMinimum(){
        return min;
    }

    public void display(){
        first.display();
    }

}
