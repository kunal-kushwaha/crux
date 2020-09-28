package com.codingblocks.check;

import com.codingblocks.Human;

public class Demo extends Human{

    public Demo(){
        System.out.println("Demo constructor");
    }

    public void display(){
        System.out.println("Not overriden");
    }

    public static void main(String[] args) {

//        Demo first = new Demo();
//        first.hello();
//
        Human second = new Human();
//        Human.hello(); // Doesn't work, why?

    }


}
