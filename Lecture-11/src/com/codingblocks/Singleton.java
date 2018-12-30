package com.codingblocks;

public class Singleton {

    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
