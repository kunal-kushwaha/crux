package com.codingblocks;

public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice(){
        super();
        System.out.println("price constructor");
        this.cost = -1;
    }

    BoxPrice(BoxPrice old){
        super(old);
        this.cost = old.cost;
    }

    BoxPrice(double height, double length, double width, double w, double cost){
        super(height, length, width, w);
        this.cost = cost;
    }

    BoxPrice(double side, double weight, double cost){
        super(side, weight);
        this.cost = cost;
        System.out.println("Running from BoxPrice (C) ");

    }

    public void BoxPriceDisplay(){
        System.out.println("Running from BoxPrice (C) ");
    }

    public void display(){
        System.out.println("Running C");
//        super.display();
    }


}
