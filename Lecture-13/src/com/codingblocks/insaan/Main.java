package com.codingblocks.insaan;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Human anuj = new Human(23, "Anuj Garg");
        Human mayank = new Human(20, "Mayank");
        Human akshar = new Human(22, "Akshar");
        Human amit = new Human(27, "Amit");

        Human mohini = new Human(24, "Mohini");
        Human neha = new Human(20, "Neha");

        // like linked list
        mayank.setBaby(mohini);
        mohini.setBaby(akshar);
        akshar.setBaby(neha);
        neha.setBaby(amit);


        Human[] arr = {anuj, mayank, akshar, amit};

//        Arrays.sort(arr);

        Arrays.sort(arr, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        // OR by Lambda expressions:
//        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + " " + arr[i].getAge());
        }

        System.out.println();

        // OR
        for (Human human : arr){
            System.out.println(human.getName() + " " + human.getAge());
        }
    }
}
