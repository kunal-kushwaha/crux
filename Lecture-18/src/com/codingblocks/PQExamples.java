package com.codingblocks;

// Priority Queue Examples
public class PQExamples {

    public static void main(String[] args) {

//        PriorityQueue<Human> queue = new PriorityQueue<>();
        PQLL<Human> queue = new PQLL<>();

        Human anuj = new Human("Anuj Garg", 24);
        Human shivam = new Human("Shivam", 20);
        Human salman = new Human("Salman Khan", 21);
        Human rahul = new Human("Rahul", 27);

        queue.add(anuj);
        queue.add(shivam);
        queue.add(salman);
        queue.add(rahul);

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }

    }


}
