package com.codingblocks;

public class QueueOptimized {

    // replace purple with this.purple

    private int[] data;
    private static int DEFAULT_SIZE = 10;

    private int end = 0;

    private int front = 0;

    public QueueOptimized(){

        this(DEFAULT_SIZE); // will run if no value is passed
    }

    public QueueOptimized(int size){

        data = new int[size];
    }
    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == front;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Removing from empty Queue");
        }
        return data[front++];
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Checking front from empty queue");
        }
        return data[0];
    }

    public void display(){

        for (int i = front; i < end ; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }

}
