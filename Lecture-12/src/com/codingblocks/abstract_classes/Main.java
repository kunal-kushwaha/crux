package com.codingblocks.abstract_classes;

public class Main {

    public static void main(String[] args) {

//        Figure fig = new Figure();  // ERROR

        //  Can do this
        Figure fig_abs = new Figure() {
            @Override
            public void area() {
                System.out.println("No area");
            }
        };

        Figure fig = new Triangle(2,4);
        Figure fig2 = new Rectangle(5,6);

        fig.area();
        fig2.area();
    }
}
