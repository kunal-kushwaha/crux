package com.codingblocks.handy.javaLibrary;

import java.io.IOException;
import java.util.Arrays;

public class compareTo_toString {
    public static void main(String[] args) throws IOException {

        Human kunal = new Human("Kunal");
        Human rahul = new Human("Rahul");
        Human apoorv = new Human("Apoorv");

        Human[] humans = {kunal, rahul, apoorv};

        System.out.println(Arrays.toString(humans));

        Arrays.sort(humans);

        System.out.println(Arrays.toString(humans));
    }
}

class Human implements Comparable<Human> {
    String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Human o) {
        return this.name.compareTo(o.name);
    }
}
