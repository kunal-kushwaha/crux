package com.codingblocks;

public class EffMain {

    public static void main(String[] args) throws Exception {

        QueueUsingStack queue = new QueueUsingStack();

        queue.add(7);
        queue.add(4);
        queue.add(8);
        queue.add(1);

        System.out.println(queue.peek());

        System.out.println(queue.remove());

        System.out.println(queue.peek());


    }
}
