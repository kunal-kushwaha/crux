package com.codingblocks.demo;

public class Main {
    public static void main(String[] args) {

        A ref = new C();

        ref.display();  // runs display() of B

//        C.show();   // Error as show is not inherited
        A.show();
//        B.show();     // Shows error
    }

}
