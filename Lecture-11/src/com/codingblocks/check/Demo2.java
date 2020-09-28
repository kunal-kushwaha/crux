package com.codingblocks.check;

import com.codingblocks.Human;

public class Demo2 extends Demo {

    public void display(){
        System.out.println("Overriden");
    }

    public static void main(String[] args) {

        Demo2 demo = new Demo2();
        demo.display();
    }

}
