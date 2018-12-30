package com.codingblocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Examples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        HashMapSeparateChain<Character,Integer> map = freq(line);
//        HashMapSeparateChain<Character,Integer> map = vowels(line);

        int[] a = {1,2,3,4};
        int[] b = {1,2,4,5};
        intersection(a,b);
//        System.out.println(map);
    }

    private static HashMapSeparateChain<Character, Integer> freq(String line) {

        HashMapSeparateChain<Character,Integer> map = new HashMapSeparateChain<>();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(line.charAt(i), 1);
            }
        }
        return map;
    }

    private static HashMapSeparateChain<Character, Integer> vowels(String line) {

        HashMapSeparateChain<Character,Integer> map = new HashMapSeparateChain<>();

        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
        }
        return map;
    }

    public static void intersection(int[] first, int[] second){
        HashMap<Integer, Integer> map = new HashMap<>();

        // create frequency map for first array
        for (int i = 0; i < first.length; i++) {
            if(map.containsKey(first[i])){
                map.put(first[i], map.get(first[i] + 1));
            }else{
                map.put(first[i],1);
            }
        }

        for (int i = 0; i < second.length; i++) {
            if(map.containsKey(second[i]) && map.get(second[i]) > 0){
                map.put(second[i], map.get(second[i] - 1));
                System.out.println(second[i]);
            }
        }
    }

    public static Integer[] duplicates(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
                list.add(nums[i]);
            }
        }

        Integer[] n = new Integer[list.size()];

        return list.toArray(n);
    }

}
