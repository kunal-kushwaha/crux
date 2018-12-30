package com.codingblocks;

import java.util.ArrayList;
import java.util.LinkedList;

public class Check {

    public static void main(String[] args) {

        ArrayList<LinkedList> list = new ArrayList<>();

        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        LinkedList c = new LinkedList();

        a.add(1);
        a.add(2);
        b.add(3);
        b.add(4);
        c.add(5);
        c.add(6);

        list.add(a);
        list.add(b);
        list.add(c);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

}
