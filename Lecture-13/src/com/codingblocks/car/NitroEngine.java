package com.codingblocks.car;

public class NitroEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starts on Nitro");
    }

    @Override
    public void stop() {
        System.out.println("Stop on Nitro");
    }

    @Override
    public void acc() {
        System.out.println("Isse tez koi aur nahi");
    }
}
