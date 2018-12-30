package com.codingblocks;

public class Demo {

    int a = 5;
    int b = 6;

    public static void main(String[] args) {
        Demo ob = new Demo();
        ob.change(3,4);

        System.out.println(ob.a);
        System.out.println(ob.b);
    }

    public void change(int i, int j){
        a = i;
        b = j;
    }
}
