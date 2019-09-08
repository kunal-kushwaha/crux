package com.codingblocks;

import java.util.Scanner;

public class BinaryTree {
    private Node root;

    private class Node{
        Node left;
        Node right;
        int value;
        public Node(int value) {
            this.value = value;
        }
    }

    public void add(Scanner s){
        int num = s.nextInt();
        this.root = new Node(num);
        add(s, root);
    }
    private void add(Scanner s, Node node){
        int l = s.nextInt();
        int r = s.nextInt();

        if(node.value != -1){
            node.left = new Node(l);
            node.right = new Node(r);
        }

    }

}
