package com.codingblocks.trying_myself;

public class GenericEngine implements Music, Engine, Break {

    @Override
    public void acc() {
        System.out.println("Accelerating");
    }

    @Override
    public void start() {
        System.out.println("Starting");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }
}
