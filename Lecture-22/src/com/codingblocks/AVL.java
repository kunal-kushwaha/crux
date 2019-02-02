package com.codingblocks;

import java.util.LinkedList;

public class AVL {

    private Node root;

    public AVL(){

    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public void populateWithSorted(int[] nums){
        populateWithSorted(nums, 0, nums.length);
    }

    public LinkedList<Node> sortedList(){

        LinkedList<Node> nodes = new LinkedList<>();

        return sortedList(this.root, nodes);
    }
    private LinkedList<Node> sortedList(Node node, LinkedList<Node> nodes) {

        if (node == null){
            return nodes;
        }

        sortedList(node.left, nodes);

        nodes.add(node);

        sortedList(node.right, nodes);

        return nodes;
    }

    public void between(int start, int end){
        between(start, end, this.root);
    }
    private void between(int start, int end, Node node) {

        if (node == null){
            return;
        }

        if (node.value >= start && node.value <= end) {
            System.out.println(node.value);
        }

        if (node.value > start){
            between(start, end, node.left);
        }

        if (node.value < end) {
            between(start, end, node.right);
        }
    }

    private void populateWithSorted(int[] nums, int start, int end) {
        if (start >= end){
            return;
        }

        int mid = (start + end)/2;

        this.insert(nums[mid]);

        populateWithSorted(nums, start, mid);

        populateWithSorted(nums, mid + 1, end);
    }

    public void insert(int value){
        this.root = insert(value, this.root);
    }

    public void display(){
        display(this.root, "Root node : ");
    }
    private void display(Node node, String details) {
        if (node == null){
            return;
        }

        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public boolean balance(){
        return balance(this.root);
    }
    private boolean balance(Node node) {
        if (node == null){
            return true;
        }

        // process the current node
        int diff = height(node.left) - height(node.right);

        if (diff < -1 || diff > 1){
            return false;
        }

        // left rec
        boolean l_balance = balance(node.left);

        // right rec
        boolean r_balance = balance(node.right);

        return l_balance && r_balance;
    }

    public Node rightRotate(Node x){
        Node y = x.left;
        Node t = y.right;

        y.right = x;
        x.left = t;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public Node leftRotate(Node y){
        Node x = y.right;
        Node t = y.left;

        x.left = y;
        y.right = t;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private Node insert(int value, Node node) {
        if (node == null){
            node = new Node(value);
            return node;
        }


        // left side trav
        if (node.value > value){
            node.left  = insert(value, node.left);
        }

        if(node.value < value){
            node.right = insert(value, node.right);
        }

        // update the heights

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1){
            if (height(node.left.left) - height(node.left.right) > 0){
                return rightRotate(node);
            }

            if (height(node.left.left) - height(node.left.right) < 0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

        }

        if (height(node.left) - height(node.right) < -1){
            if (height(node.right.left) - height(node.right.right) < 0){
                return leftRotate(node);
            }

            if (height(node.right.left) - height(node.right.right) > 0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;

    }

    public boolean isEmpty(){

        return this.root == null;
    }

    public int height(){
        return height(root);
    }
    private int height(Node node){
        if (node == null){
            return -1;
        }

        return node.height;
    }

    public class Node {
        private int value;
        private Node left;
        private Node right;

        private int height;

        public Node(int value) {
            this.value = value;
            this.height = 0;
        }

        public int getValue() {
            return value;
        }
    }
}
