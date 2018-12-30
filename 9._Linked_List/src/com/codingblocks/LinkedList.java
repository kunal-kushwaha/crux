package com.codingblocks;

public class LinkedList {

    Node head;
    Node tail;

    int size;

    public LinkedList(){
        this.size = 0;
    }

    private class Node{
        String value;
        Node next;

        public Node(String value) {
            this.value = value;
        }

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public void insertFirst(String value){

        Node node = new Node(value);

        node.next = head;
        head = node;

        if(head == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(String value){

        if(size == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);

        tail.next = node;
        tail = node;
        size++;
    }

    public void display(){

        if(size == 0){
            System.out.println("Empty list");
        }

        Node node = head;

        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

//    public Node get(String value){
//        Node node = head;
//
//        while(node != null){
//            if(node.value.equals(value)){
//                return node;
//            }
//            node = node.next;
//        }
//        return null;
//    }

    public Node get(int index){

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    // Question 1
    // DONE

    // Question 2
    public void duplicates(){
        Node node = head;

        while(node.next != null){

            if(node.value.equals(node.next.value) && node.value != null){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
    }

    // Question 3
    public static LinkedList merge(LinkedList first, LinkedList second){

        Node f = first.head;
        Node s = second.head;

        LinkedList list = new LinkedList();

        while(f != null && s != null) {

            if (f.value.compareTo(s.value) > 0) {
                list.insertLast(s.value);
                s = s.next;
            } else {
                list.insertLast(f.value);
                f = f.next;
            }
        }

        while(f != null){
            list.insertLast(f.value);
            f = f.next;
        }
        while(s != null){
            list.insertLast(s.value);
            s = s.next;
        }


        return list;
    }

    // Question 4
    public Node mid(){

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Question 5

    // Question 6

    // Question 7
    // DONE

    // Question 8
    public void reverse(){

        if(size < 2){
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        tail = present;

        while(present != null){

            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;

    }

    public void revRec(){
        revRec(this.head);
    }
    public void revRec(Node node){

        if(node == tail){
            tail = head;
            return;
        }

        revRec(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // Question 9
    // DONE

    // Question 10
    // DONE

    // Question 11
    // DONE

    // Question 12


}
