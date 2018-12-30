package com.codingblocks.car;

public class CustomCar {

    private Engine engine;    // private for encapsulation

    public CustomCar(){
        engine = new PetrolEngine();
    }

    public CustomCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void replaceEngine(){
        engine = new PetrolEngine();
    }

    public void upgradeEngine(){
        engine = new NitroEngine();
    }

    public void setEngine(Engine engine){       // Setter method
                                                // write set before variable name
        this.engine = engine;
    }

    public void someOtherMethod(Engine engine){
        this.engine = engine;
        System.out.println("Just doing some random");
    }

    private MusicPlayer player = new Player();

    public void stopMusic(){
        player.stop();
    }
    public void startMusic(){
        player.start();
    }

}
