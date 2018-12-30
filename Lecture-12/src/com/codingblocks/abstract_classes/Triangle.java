package com.codingblocks.abstract_classes;

public class Triangle extends Figure{

    Triangle(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }


    @Override
    public void area() {

        double area_fig = 0.5 * dim1 * dim2;
        System.out.println("Area of triangle : " + area_fig);
    }
}
