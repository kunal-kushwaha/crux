package com.codingblocks;

public class JavaTeacher implements Teacher{
    // implementation means implementation is not provided and this class will provide it.

    @Override
    public void study() {
        System.out.println("I study Java");
    }

    @Override
    public void teach() {
        System.out.println("I teach Java");
    }

    public void dance(){
        System.out.println("I dance in Java");
    }

}
