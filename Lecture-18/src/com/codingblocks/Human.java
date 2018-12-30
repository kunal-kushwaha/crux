package com.codingblocks;

public class Human implements Comparable<Human>{

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return age + " -> " + name;
    }

//    @Override
//    public int compareTo(Human old) {
//        return this.age - old.age;
//    }

    @Override
    public int compareTo(Human old) {
        return this.name.compareTo(old.name);
//        return - this.name.compareTo(old.name);   // for descending
    }
}
