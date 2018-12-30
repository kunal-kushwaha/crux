package com.codingblocks.abstract_classes;

public class Rectangle extends Figure{

    Rectangle (double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    @Override
    public void area() {
        double area_fig = dim1 * dim2;
        System.out.println("Area of rectangle : " + area_fig);
    }
}
