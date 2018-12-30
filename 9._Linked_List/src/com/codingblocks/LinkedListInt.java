package com.codingblocks;

public class LinkedListInt {

    Node head;
    Node tail;
    int size;

    LinkedListInt(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(Node node){
            this.value = node.value;
        }
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node node){
            this.value = value;
            this.next = node;
        }
    }

    public void insertNodeFirst(Node node){

        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertNodeLast(Node node){

        Node temp = new Node(node);

        if(size == 0) {
           insertNodeFirst(temp);
           return;
        }

        tail.next = temp;
        tail = temp;
        tail.next = null;
        size++;
    }

    public void insertFirst(int value){

        Node node = new Node(value);

        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){

        if(size == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);

        tail.next = node;
        tail = node;
        tail.next = null;
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

    private Node get(int value){

        Node node = head;

        while(node != null){

            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private Node getNode(int index){

        Node node = head;

        while(node != null){

            if(index == 0){
                return node;
            }
            node = node.next;
            index--;
        }
        return null;
    }

    private int getIndex(int value){
        Node node = head;
        int index = 0;

        while(node != null){

            if(node.value == value){
                return index;
            }
            node = node.next;
            index++;
        }
        return -1;
    }


    // Q_1

    public void swap(int value1, int value2){

        int indexF = getIndex(value1);
        int indexS = getIndex(value2);

        // current
        Node first = get(value1);
        Node second = get(value2);

        // previous
        Node preFirst = getNode(indexF - 1);
        Node preSecond = getNode(indexS - 1);

        preFirst.next = second;
        preSecond.next = first;

        Node temp = first.next;
        first.next = second.next;
        second.next = temp;
    }

    // Q_7
    public boolean palin(){

        Node node = head;

        StringBuilder temp = new StringBuilder();

        while(node != null){
            temp.append(node.value);
            node = node.next;
        }

        int beg = 0;
        int last = temp.length() - 1;

        while(beg < last){

            if(temp.charAt(beg) != temp.charAt(last)){
                return false;
            }
            beg += 1;
            last -= 1;
        }
        return true;
    }

    // Q_9

    public void oddEven(){

        Node even_h = null;
        Node even_t = null;
        Node odd_h = null;
        Node odd_t = null;

        Node node = head;

        while(node != null){

            // even
            if(node.value % 2 == 0){

                if(even_h == null){
                    even_h = node;
                    even_t = node;
                }else{
                    even_t.next = node;
                    even_t = node;
                }
            } else{
                if (odd_h == null) {
                    odd_h = node;
                    odd_t = node;
                } else {
                    odd_t.next = node;
                    odd_t = node;
                }
            }

            node = node.next;
        }

        odd_t.next = even_h;
        head = odd_h;
        tail = even_t;

        tail.next = null;
    }

    // Q_10

    public void rev(){
        rev(this.head);
        System.out.println("END");
    }
    private void rev(Node node){

        if(node == null){
            return;
        }

        rev(node.next);

        System.out.print(node.value + " <- ");

    }

    // Q_11

    public void append(int n){

        Node newBeg = getNode(size - n);
        Node newTail = getNode(size - n - 1);

        tail.next = head;
        tail = newTail;
        tail.next = null;

        head = newBeg;
    }

    // Q_12
    public void kRev(int k) {

        LinkedListInt temp = new LinkedListInt();

        for (int i = k - 1; i < size; i += k) {

            for (int j = 0; j < k; j++) {

                Node no = getNode(i - j);
                temp.insertNodeLast(no);
            }
        }
        head = temp.head;
        tail = temp.tail;
    }


}
