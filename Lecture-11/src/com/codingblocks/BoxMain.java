package com.codingblocks;

public class BoxMain {

    public static void main(String[] args) {

//        BoxPrice box = new BoxPrice(4, 20, 700);

//        box.BoxDisplay();
//        box.BoxWeightDisplay();
//        box.BoxPriceDisplay();

//        box.display();

        // Checking Dynamic Method Dispatch
        Box box1 = new Box();
        Box box2 = new BoxWeight();
        Box box3 = new BoxPrice();

        System.out.println();

        box1.display();
        box2.display();
        box3.display();

    }

}
