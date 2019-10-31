package com.codingblocks;

public class LinkedListStudent {

    private Student head;
    private Student tail;

    private int size;

    public LinkedListStudent(){
        size = 0;
    }

    public void insertFirst(String value){

        Student student = new Student(value);
        student.next = head;
        head = student;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertLast(String value){

        if(size == 0){
            insertFirst(value);
            return;
        }
        Student student = new Student(value);
        tail.next = student;
        tail = student;

        size++;
    }

    // insert at particular index
    public void insert(String value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }else if(index == size){
            insertLast(value);
            return;
        }
        Student previous = get(index - 1);
        Student student = new Student(value, previous.next);
        previous.next = student;
        size++;
    }

    public String deleteFirst(){
        String value = head.name;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public String deleteLast(){
        if(size < 2){   // Only 1 item
            return deleteFirst();
        }
        Student student = get(size - 2);
        String value = tail.name;
        tail = student;
        tail.next = null;
        size--;
        return value;

    }

    public Student get(int index){
        Student student = head;
        for (int i = 0; i < index; i++) {
            student = student.next;
        }

        return student;
    }

    // Delete from particular index
    public String delete(int index){
        if(index == 0){
            return deleteLast();
        }
        if(index == size - 1){
            return deleteLast();
        }
        Student prev = get(index - 1);
        String t = prev.next.name;
        prev.next = prev.next.next;
        size--;
        return t;
    }

    // Reverse linked list
    public void reverse(){
        if(size < 2){   // list of size 1
            return;
        }
        Student prev = null;
        Student present = head;
        Student next = present.next;
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

    // Using recursion
    private void reverse(Student student) {
        if(student == tail){
            head = tail;
            return;
        }

        reverse(student.next);

        tail.next = student;
        tail = student;
        tail.next = null;
    }

    public void display(){
        Student student = head;
        while(student != null){
            System.out.print(student.name + " -> ");
            student = student.next;
        }
        System.out.println("END");
    }

    private class Student {
        private String name;
        private Student next;
        public Student(String name) {
            this.name = name;
        }
        public Student(String name, Student next) {
            this.name = name;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkedListStudent list = new LinkedListStudent();
        list.insertFirst("Kunal");
        list.insertFirst("Rahul");
        list.insertFirst("Pranshul");
        list.insertFirst("Apoorv");
        list.display();
        list.reverse();
        list.display();
        list.deleteLast();
        list.delete(1);
        list.display();
    }

}
