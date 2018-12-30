package com.codingblocks;

import java.util.LinkedList;

// cost of insert is n
// cost of remove and finding min is constant
// making PQ ourselves.

public class PQLL<T extends Comparable<T>> {

    private LinkedList<T> list;

    public PQLL() {
        this.list = new LinkedList<>();
    }

    public void add(T value){

        int counter = 0;

        for(T item : list){
            if(value.compareTo(item) < 0){
                break;
            }
            counter++;
        }
        list.add(counter, value);
    }

    public T remove(){
        return list.removeFirst();
    }

    public T min(){
        return list.getFirst();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
