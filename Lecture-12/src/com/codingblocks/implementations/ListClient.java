package com.codingblocks.implementations;

public class ListClient {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

//        ArrayListGeneric<Integer> list = new ArrayListGeneric<>();

        for (int i = 0; i < 10000; i++) {
            list.add(i);
            System.out.println("Added "  + i);
        }

        for (int i = 0; i < 10000; i++) {
            System.out.println(list.remove());
        }

    }


}
