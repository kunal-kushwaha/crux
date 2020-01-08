package com.codingblocks.trees;

import java.util.Scanner;

public class CheckBST {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BST bst = new BST();
        bst.insert(4);
        bst.insert(2);
        bst.insert(5);
        bst.insert(1);
        bst.insert(3);

        System.out.println(bst.checkBST());
    }
}

class BST {
    Node root;

    private class Node {
        int value;
        Node left, right;
        public Node(int value) {
            this.value = value;
        }
    }

    public boolean checkBST() {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean checkBST(Node node, int min, int max) {
        if(node == null) {
            return true;
        }
        if(node.value < min || node.value > max) {
            return false;
        }
        return checkBST(node.left, min, node.value-1) && checkBST(node.right, node.value+1, max);
    }

    public void insert(int value) {
        this.root = insert(value, root);
    }
    private Node insert(int value, Node node) {
        if(node == null) {
            return new Node(value);
        }
        if(value < node.value) {
            node.left = insert(value, node.left);
        }
        if(value >= node.value) {
            node.right = insert(value, node.right);
        }
        return node;
    }
}
