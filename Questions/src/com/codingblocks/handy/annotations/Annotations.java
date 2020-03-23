package com.codingblocks.handy.annotations;

import java.util.ArrayList;

@FunctionalInterface // Only one abstract method
interface ABC{
    void show();
//    void hide();    // ERROR
}

public class Annotations {
    static class Base {
        public void display() {
            System.out.println("Base display()");
        }
    }
    static class Derived extends Base {
        @Override
        @SuppressWarnings("unchecked")
        public void display() {
            ArrayList list = new ArrayList();
            System.out.println("Derived display()");
        }

        @Deprecated
        public void hello(){
            System.out.println("Hello World");
        }
    }
    public static void main(String args[]) {
        Derived obj = new Derived();
        obj.display();
        obj.hello();
    }

}
