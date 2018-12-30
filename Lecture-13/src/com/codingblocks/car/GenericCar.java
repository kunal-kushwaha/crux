package com.codingblocks.car;

public class GenericCar implements Engine, Brake, Steering, MusicPlayer {

    @Override
    public void apply() {
        System.out.println("Apply Brake");
    }

    @Override
    public void start() {
        System.out.println("Start my engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop my engine");
    }

    @Override
    public void acc() {
        System.out.println("My car is running ");
    }

    @Override
    public void steer() {
        System.out.println("Moving to left and right");
    }
}
