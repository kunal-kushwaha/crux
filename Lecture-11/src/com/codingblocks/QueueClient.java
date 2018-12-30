package com.codingblocks;

public class QueueClient {

    public static void main(String[] args) throws Exception {
        QueueOptimized queue = new QueueOptimized();

        for (int i = 0; i < 10; i++) {
            int random = (int)(Math.random()*100);
            queue.insert(random);
            queue.display();
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println("Removed " + queue.remove());
            queue.display();
        }
    }
}
