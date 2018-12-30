package com.codingblocks;

public class QueueClient {

    public static void main(String[] args) throws Exception {

        Queue queue = new Queue(10);

        for (int i = 0; i < 6; i++) {
            queue.insert(i+1);
        }

        queue.display();

        queue.rev(0, queue.size() - 1);

        queue.display();

    }
}
