package com.codingblocks;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Human anuj = new Human("Anuj Garg", 24);
        Human shivam = new Human("Shivam", 20);
        Human salman = new Human("Salman Khan", 21);
        Human rahul = new Human("Rahul", 27);

        Human[] humans = {anuj, shivam, salman, rahul};

        System.out.println(anuj.compareTo(salman));

        System.out.println(Arrays.toString(humans));

        Arrays.sort(humans);    // this sort will use compareTo() which we have defined
        // while sorting, compareTo() that we defined will be applied to each item

//        System.out.println(Arrays.toString(humans));
//
//        Arrays.sort(humans, new Comparator<Human>() {
//            @Override
//            public int compare(Human o1, Human o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
//
//        Arrays.sort(humans, (o1, o2) -> o1.getAge() - o2.getAge());

        System.out.println(Arrays.toString(humans));

    }

}
