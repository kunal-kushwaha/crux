package com.codingblocks;

public class DynamicQueue extends QueueCircluar{

    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {

        if(isFull()){
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }

            front = 0;
            end = data.length;
            data = temp;
        }
        return super.insert(item);
    }
}
