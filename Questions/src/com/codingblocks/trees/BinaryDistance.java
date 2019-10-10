package com.codingblocks.trees;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BinaryDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = sc.nextInt();
        int V = sc.nextInt();
        System.out.println(maxDist(N, V));
    }

    public static int maxDist(int N, int V) {
        Tree tree = new Tree();
        tree.createTree(N);
        int height = tree.height(tree.find(V));
        int depth = tree.upHeight() - height;
        int leftMax = tree.leftmax();
        int rightMax = tree.rightMax();
        int where = tree.where(V);
        int other;
        if(where == 0) {
            other = depth + rightMax;
        } else {
            other = depth + leftMax;
        }
        return Math.max(Math.max(height, depth), other);
    }
}

class Tree {
    private Node r;
    private class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }

    public int where(int V){
        return where(r, V, -1);
    }
    private int where(Node node, int V, int side) {
        // 0 if left, 1 if right
        if(node == null) {
            return -1;
        }
        if(node.key == V) {
            return side;
        }
        int l = where(node.left, V, 0);
        int r = where(node.right, V, 1);
        if(l != -1) {
            return l;
        }else return r;
    }

    public int leftmax() {
        return height(r.left);
    }

    public int rightMax() {
        return height(r.right);
    }

    public int upHeight() {
        return height(r);
    }

    public Node find(int value){
        return find(r, value);
    }
    private Node find(Node node, int value) {

        if(node == null){
            return null;
        }

        if(node.key == value){
            return node;
        }
        Node left = find(node.left, value);
        Node right = find(node.right, value);

        if(left != null) {
            return left;
        } else return right;
    }

    public int height(Node node) {
        if(node == null){
            return -1;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public Node insertValue(Node root, int value, LinkedList<Node> q) {
        Node node = new Node(value);
        if(root == null) {
            root = node;
        } else if(q.peekFirst().left == null) {
            q.peekFirst().left = node;
        } else {
            q.peekFirst().right = node;
            q.pop();
        }
        q.push(node);
        return root;
    }

    public void createTree(int n) {
        Node root = null;
        LinkedList<Node> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            root = insertValue(root, i, q);
        }
        r = root;
    }
}