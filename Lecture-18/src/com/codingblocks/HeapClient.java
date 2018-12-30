package com.codingblocks;

import java.util.ArrayList;

public class HeapClient {

    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<>();

        heap.insert(234);
        heap.insert(543);
        heap.insert(35);
        heap.insert(456);

//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());

        ArrayList list = heap.heapSort();

        System.out.println(list);

    }
}
