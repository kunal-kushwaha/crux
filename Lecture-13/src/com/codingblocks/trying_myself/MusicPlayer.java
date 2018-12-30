package com.codingblocks.trying_myself;

public class MusicPlayer implements Music {
    @Override
    public void start() {
        System.out.println("Rock ON");
    }

    @Override
    public void stop() {
        System.out.println("Rock OFF");
    }
}
