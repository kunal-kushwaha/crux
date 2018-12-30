package com.codingblocks.trying_myself;

public class CustomCar {

    private Engine engine;
    private Music player;

    CustomCar(){
        this.engine = new PetrolEngine();
        this.player = new MusicPlayer();
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }

    public void changeEngine(){
        engine = new NitroEngine();
        System.out.println("Engine Changed");
    }

    public void replaceEngine(){
        engine = new PetrolEngine();
    }

}
