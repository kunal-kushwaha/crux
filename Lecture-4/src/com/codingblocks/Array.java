package com.codingblocks;

public class Array {

    public static void main(String[] args) {

        // create empty array of size 10
        int[] nums = new int[10];
        // make an object 'new int[10]' of type int[] (i.e. array) and reference it to 'num'

        // nums is a reference
        // new int[10] is object

        // cannot do long [] nums = new int[10];
        // because we can store int in long but we cannot store an array of int in long

        // long [] nums = new long[10]; will work
        // create array of size 3 with custom values
        int[] data = {12, 43, 345};

        System.out.println(nums[1]);
        // value in index is 0 if the index is empty
        System.out.println(data[0]);

        System.out.println(nums.length);
        System.out.println(data.length);

        System.out.println();

        for(int i = 0; i < data.length ; i++) {
            System.out.println(data[i]);
        }

        System.out.println();

        data[2] = data[2] / 2;
        for(int i = 0; i < data.length ; i++) {
            System.out.println(data[i]);
        }

        System.out.println();

        int temp = data[0];
        data[0] = data[2];
        data[2] = temp;

        System.out.println(data);
//       You aren't actually using objects when you assign an object to a variable or pass an
//       object to a method as an argument. You aren't even using copies of the objects.
//       Instead, you're using references to those objects.
        increase(data);
        // this is called side effect because value in array changed because of method increase
    }

    public static void increase(int[] arr) {

        // reference will be passed of 'data'
        // think of it like the object is handed to some other reference (arr in this case)
        // which does the same work
        System.out.println("Increase: " + arr);
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[i] + 1;
        }
    }

}
