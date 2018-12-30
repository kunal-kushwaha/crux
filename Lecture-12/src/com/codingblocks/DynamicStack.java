package com.codingblocks;

public class DynamicStack extends Stack{

    public DynamicStack(){
        super();    // calls Stack() i.e. Constructor
    }

    public DynamicStack(int size){
        super(size);       // calls Stack(int size) i.e. Constructor
    }


    @Override
    public boolean push(int item) {
        if(this.isFull()){
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }
        return super.push(item);
    }
}
