package com.codingblocks.car;

public class Player implements MusicPlayer {
    @Override
    public void start() {
        System.out.println("Rock ON");
    }

    @Override
    public void stop() {
        System.out.println("Rock OFF");
    }
}
