package com.codingblocks;

public class BoxWeight extends Box {

    double weight;

    BoxWeight(){
        super();
        System.out.println("weight constructor");
        this.weight = -1;
    }

    BoxWeight(BoxWeight old){
        super(old);
        this.weight = old.weight;
    }

    BoxWeight(double height, double length, double width, double weight){
        super(height, length, width);
        this.weight = weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
        System.out.println("Running from BoxWeight (B) ");

    }

    public void BoxWeightDisplay(){
        System.out.println("Running from BoxWeight (B) ");
    }

    public void display(){
        System.out.println("Running B");
    }

}
