package com.codingblocks.car;

public class Main {
    public static void main(String[] args) {
//        GenericCar car = new GenericCar();
//
//        car.apply();
//
//        car.start();
//
//        car.stop();
//
//        MusicPlayer player = new GenericCar();
//
//        player.stop();      // when you stop music engine car will also stop.
//                            // this is not what we want.
//        // also if we want to change steering we will hve to create new object i.e. make a new car just to change
//          steering. this is not what we want.
//        // we solve this with CustomCar

        NitroEngine engine = new NitroEngine();

        CustomCar car = new CustomCar();
        car.start();
        car.stop(); //Encapsulation provided

        for (int i = 0; i < 20; i++) {
            car.start();
            car.stop();
        }

        car.replaceEngine();

        for (int i = 0; i < 20; i++) {

            car.start();
            car.stop();

        }

        car.upgradeEngine();

        for (int i = 0; i < 20; i++) {

            car.start();
            car.stop();

        }

        car.startMusic();
        car.stopMusic();
    }
}
