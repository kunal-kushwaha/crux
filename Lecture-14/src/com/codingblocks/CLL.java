package com.codingblocks;

public class CLL {

    Node head, tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
        tail.next = head;
    }

    public void deleteNode(int valueToDelete) {
        Node currentNode = head;

        if (head != null) {
            if (currentNode.value == valueToDelete) {
                head = head.next;
                tail.next = head;
            } else {
                do {
                    Node nextNode = currentNode.next;
                    if (nextNode.value == valueToDelete) {
                        currentNode.next = nextNode.next;
                        break;
                    }
                    currentNode = currentNode.next;
                } while (currentNode != head);
            }
        }
    }

    public void display() {
        Node node = head;
        if(head != null) {
            do {
                System.out.print(node.value + " ");
                node = node.next;
            } while(node != head);
        }
    }

    private class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CLL ll = new CLL();
        ll.insert(2);
        ll.insert(3);
        ll.insert(5);
        ll.insert(6);
        ll.insert(8);
        ll.display();
    }
}


