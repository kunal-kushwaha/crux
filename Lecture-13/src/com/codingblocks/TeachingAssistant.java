package com.codingblocks;

public class TeachingAssistant implements Student, Teacher {

    @Override
    public void study() {
        System.out.println("I study more like a teacher");
    }

    @Override
    public void teach() {
        System.out.println("I teach more like a student");
    }

}
