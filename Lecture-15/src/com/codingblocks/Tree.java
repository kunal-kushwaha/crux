package com.codingblocks;

import java.util.Scanner;

public class Tree {

    private Node root;

    private static class Node{

        private int value;

        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void populate(Scanner scanner){
        int value = scanner.nextInt();
        root = new Node(value);

        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node) {
        boolean left = scanner.nextBoolean();
        if (left) {
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        boolean right = scanner.nextBoolean();
        if (right) {
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    // Total number of nodes
    public int size(){
        return size(root);
    }
    private int size(Node node) {
        if(node == null){
            return 0;
        }
        return 1 + size(node.left) + size(node.right);
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node) {
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node) {
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node) {
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Tree tree = new Tree();
        tree.populate(s);
        tree.inOrder();
        System.out.println();
        tree.preOrder();
        System.out.println();
        tree.postOrder();
        System.out.println();
    }

}
