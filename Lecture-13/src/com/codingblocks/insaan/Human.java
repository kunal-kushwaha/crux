package com.codingblocks.insaan;

public class Human implements Comparable<Human> {

    private int age;
    private String name;

    private Human baby;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    // now we have 2 humans, this and other
    // we can compare 2 humans
    @Override
    public int compareTo(Human other) {

        return this.age - other.age;
//        return  - (this.age - other.age); // - for reverse
    }

    public void setBaby(Human baby) {
        this.baby = baby;
    }

    public Human getBaby() {
        return baby;
    }
}
