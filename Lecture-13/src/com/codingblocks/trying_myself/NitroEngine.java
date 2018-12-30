package com.codingblocks.trying_myself;

public class NitroEngine implements Engine{
    @Override
    public void acc() {
        System.out.println("Accelerating on Nitro");
    }

    @Override
    public void start() {
        System.out.println("Starting on Nitro");
    }

    @Override
    public void stop() {
        System.out.println("Stopping on Nitro");
    }
}
