package com.codingblocks;

public class SingletonClient {

    public static void main(String[] args) {

        Singleton single = Singleton.getInstance();

//        Singleton single = new Singleton();       // cannot do this because constructor is private.

        Singleton dub = Singleton.getInstance();

        System.out.println(single);
        System.out.println(dub);

    }
}
