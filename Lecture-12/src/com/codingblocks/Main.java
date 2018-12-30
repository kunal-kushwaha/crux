package com.codingblocks;

public class Main {

    public static void main(String... args) {

        PetrolEngine engine = new PetrolEngine();
        engine.khamba();

        Engine engine1 = new PetrolEngine();
        engine1.khamba();
//        PetrolEngine engine1 = new PetrolEngine();

        System.out.println(engine1.name);

        PetrolEngine pe = (PetrolEngine) engine1;

//                 Engine engine1 = (PetrolEngine)(new PetrolEngine());     // Hardcast
                    // lhs will run but rhs will be caught by compiler

//        engine1.makenoise();      // shows error because lhs(reference) is looked be compiler
//                                     rhs (object) is looked by jvm


//        engine.acc_speed = 7;
        System.out.println(engine.acc_speed);
        engine.start();
        engine.stop();
        engine.acc();

        engine.makeNoise();

//        sum(1,3,5,6,7);
    }

    public static int sum(int... nums){ // like *args in python

        // (int... nums, String S) : NOT OKAY!!
        // (String S, int... nums) : OKAY!
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
