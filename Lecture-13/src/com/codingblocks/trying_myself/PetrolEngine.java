package com.codingblocks.trying_myself;

public class PetrolEngine implements Engine{

    private int cycles = 5;

    @Override
    public void acc() {
        System.out.println("Accelerating on Petrol Engine");
    }

    @Override
    public void start() {
        if(cycles > 0){
            System.out.println("Starting Petrol Engine");
            cycles--;
        }else{
            System.out.println("We cannot start");
        }
    }

    @Override
    public void stop() {
        System.out.println("Stopping on Petrol Engine");
    }
}
