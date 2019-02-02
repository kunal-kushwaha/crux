package com.codingblocks;

import java.util.Arrays;

public class SegmentTree {

    private class Node{
        int data;   // the sum
        int startInterval;  // start index of array
        int endInterval;    // end index ofn array
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    // Constructed in O(N)
    private Node constructTree(int[] arr, int start, int end) {

        if(start == end){
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);

        int mid = (start + end) / 2;

        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;

    }

    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str = "";

        if(node.left != null){
            str = str + " Interval=["+ node.left.startInterval + "-" + node.left.endInterval + "] and Data: "
                    + node.left.data + " => ";
        }else{
            str = str + " No Left Child ";
        }

        // for current node
        str = str + " Interval=["+ node.startInterval + "-" + node.endInterval + "] and Data: "
                + node.data + " <= ";

        if(node.right != null){
            str = str + " Interval=["+ node.right.startInterval + "-" + node.right.endInterval + "] and Data: "
                    + node.right.data;
        }else{
            str = str + " No Right Child ";
        }

        System.out.println(str);

        if(node.left != null){
            display(node.left);
        }

        if(node.right != null){
            display(node.right);
        }
    }

    // can compute sum in O(log(N))
    // query's start index, query's end index
    public int query(int qsi, int qei){
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei){

        if((node.startInterval >= qsi && node.endInterval <= qei)){
            // node is completely lying inside query so it will contribute it's value to actual answer
            return node.data;
        }else if(node.startInterval > qei || node.endInterval < qsi){
            // this is when node is completely outside query's interval
            return 0;
        }else{
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    public void update(int index, int value){
        this.root.data = update(this.root, index, value);
    }

    private int update(Node node, int index, int newValue) {

        if (index >= node.startInterval && index <= node.endInterval) {

            if(index == node.startInterval && index == node.endInterval){
                node.data = newValue;
                return node.data;
            }else{
                node.data = update(node.left, index, newValue) + update(node.right, index, newValue);
                return node.data;
            }
        }
        return node.data;
    }
}
