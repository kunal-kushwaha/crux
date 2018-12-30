package com.codingblocks;

public class QueueClient {

    public static void main(String[] args) throws Exception{

        DynamicQueue queue = new DynamicQueue();

        for (int i = 0; i < 1000; i++) {
            queue.insert(i);
        }

        for (int i = 0; i < 1000; i++) {
            System.out.println(queue.remove());
        }

    }
}
