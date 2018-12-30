package com.codingblocks;

public class Box {

    private double width;
    private double height;
    private double length;

    Box(){
        System.out.println("box constructor");

        this.height = -1;
        this.length = -1;
        this.width = -1;
    }

    Box(Box old){
        this.height = old.height;
        this.length = old.length;
        this.width = old.width;
    }

    Box(double side){
        this.height = side;
        this.length = side;
        this.width = side;
        System.out.println("Running from BOX (A) ");

    }

    Box(double height, double length, double width){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public void BoxDisplay(){
        System.out.println("Running from BOX (A) ");
    }

    public void display(){
        System.out.println("Running A");
    }

}
