package com.codingblocks.trying_myself;

import com.codingblocks.car.GenericCar;

public class Main {

    public static void main(String[] args) {

//        GenericEngine car = new GenericEngine();
//
//        car.start();
//        car.stop();
//        car.acc();

        // Now if we want to change Engine we will have to create a new object i.e. a new car just to change the engine.

        CustomCar car = new CustomCar();

        for (int i = 0; i < 5; i++) {
            car.start();
        }

        car.replaceEngine();
        car.start();

        car.stop();
        car.startMusic();
        car.stopMusic();

        // changing engine without creating new object
        car.changeEngine();
        car.start();
        car.stop();

    }
}
