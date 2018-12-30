package com.codingblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    // ex: makes an array of 5. when its gets filled it makes another
    // array of some more size and copies those 5 elements in it.
    // when we create a new arraylist it 'lies' and said that the size is 0 but instead the size is say, 10.
    // after 10 elements are filled it repeats above step.
    public static void main(String[] args) {
        ArrayList list = new ArrayList();   // ArrayList is a class
        System.out.println(list.size());

        // adds at the last of the list
        list.add(1);    // max index is 0
        list.add(2);    // max index is 1
        list.add(5);
        list.add(7);

        System.out.println(list.size());    // 4
        System.out.println(list.get(2));    // 5

        System.out.println();

        list.set(2, 77); // Put value 77 in index 2
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

    public static void largest() {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        ArrayList list = new ArrayList();
        for(int i = 0; i < N; i++){
            int a = input.nextInt();
            list.add(a);
        }


        int max = 0;
        for (int i = 1; i < N; i++) {
            if((int)(list.get(i)) > (int)(list.get(max)))
                max = i;
        }
        System.out.println(list.get(max));
    }
}
