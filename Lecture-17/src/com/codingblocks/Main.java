package com.codingblocks;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        Map<String, String> dict = new HashMap<>();
//        MapUsingHash dict = new MapUsingHash();
//        MapLinkedList dict = new MapLinkedList();
        HashMapSeparateChain<String, String> dict = new HashMapSeparateChain<>();

        dict.put("Apple", "A sweet red fruit");
        dict.put("Mango", "King of fruits");
        dict.put("Litchi", "Yum Yum");
        dict.put("Litchi", "Yum Yum");

        for (int i = 0; i < 20; i++) {
            dict.put("A" + i, "a" + i);
        }

        System.out.println(dict);

        System.out.println(dict.get("Apple"));

        dict.remove("Apple");

        System.out.println(dict.get("Apple"));

        // keySet() makes a set of key values
//        for(String fruit : dict.keySet()){
//            System.out.println(fruit);
//        }
//
//        for(String fruit : dict.values()){
//            System.out.println(fruit);
//        }
    }
}
