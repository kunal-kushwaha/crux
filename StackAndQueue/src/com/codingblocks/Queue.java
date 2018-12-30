package com.codingblocks;

public class Queue {

    private int[] data;
    private static int DEFAULT_SIZE = 10;

    private int end = 0;

    public Queue(){
        this(DEFAULT_SIZE); // will run if no value is passed
    }

    public Queue(int size){

        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
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
        int temp = data[0];
        for (int i = 1; i < end ; i++) {
            data[i-1] = data[i];
        }
        end--;
        return temp;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Checking front from empty queue");
        }
        return data[0];
    }

    public void display(){

        for (int i = 0; i < end ; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }

    public int size(){
        return end;
    }

    // Q_3

    public void rev(int beg, int last){

        if(beg > last){
            return;
        }

        int temp = data[beg];
        data[beg] = data[last];
        data[last] = temp;

        rev(beg+1, last-1);
    }

}
