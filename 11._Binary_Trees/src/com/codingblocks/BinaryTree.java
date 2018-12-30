package com.codingblocks;

import java.util.*;

public class BinaryTree {

    public Node root;

    public BinaryTree() {

    }

    public static class Node{
        public int value;
        public Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }


    public void populate(Scanner scanner){
        System.out.println("Enter root node: ");
        int value = scanner.nextInt();
        this.root = new Node(value);

        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root,0);
    }
    private void display(Node node, int level){
        if(node == null){
            return;
        }

        display(node.right, level+1);

        if(level!=0){
            for(int i = 0; i < level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.value);
        }
        else{
            System.out.println(node.value);
        }
        display(node.left, level + 1);
    }

    public int height(){
        return height(root);
    }
    private int height(Node node) {

        if(node == null){
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));

    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node) {
        if(node == null){
            return;
        }

        System.out.println(node.value);
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
        System.out.println(node.value);
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
        System.out.println(node.value);

    }


    // Q_1
    public int sum(){
        return sum(root);
    }
    private int sum(Node node){
       if(node == null){
           return 0;
       }
       return node.value + sum(node.left) + sum(node.right);
    }

    // Q_2
    public static boolean identical(BinaryTree first, BinaryTree second) {

        return identical(first.root, second.root);
    }
    private static boolean identical(Node first, Node second){

        if(first == null && second == null){
            return true;
        }
        if(first != null && second != null){
            return identical(first.left, second.left) && identical(first.right, second.right);
        }else{
            return false;
        }

    }

    // Q_3
    public boolean balanced() {

        int left = height(root.left);
        int right = height(root.right);

        if (Math.abs(left - right) <= 1) {
            return true;
        }
        return false;
    }

    // Q_4
    public ArrayList<LinkedList> create(){

        ArrayList<LinkedList> list = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();

        if(root == null){
            return list;
        }

        q.add(root);

        LinkedList l = new LinkedList<>();

        Queue s = new LinkedList();

        while(!q.isEmpty()){

            Node n = q.remove();
            l.add(n.value);


            if(n.left != null){
                s.add(n.left);
            }
            if(n.right != null){
                s.add(n.right);
            }

            if(q.isEmpty()){
                q.addAll(s);
                list.add(l);
                LinkedList<Node> t = new LinkedList<>();
                l = t;
                LinkedList<Node> p = new LinkedList<>();
                s = p;
            }

        }

        return list;

    }

    // Q_5
    public void noSibling(){
        noSibling(this.root);
    }
    private void noSibling(Node node){

        if(node == null){
            return;
        }

        if(node.left != null && node.right == null){
            System.out.println(node.left.value);
        }
        if(node.left == null && node.right != null){
            System.out.println(node.right.value);
        }

        noSibling(node.left);
        noSibling(node.right);
    }

    // Q_6
    public void removeLeaves(){
        removeLeaves(root);
    }
    private void removeLeaves(Node node){

        if(node == null){
            return;
        }

        if(node.left.left == null && node.left.right == null){
            node.left = null;
        }
        if(node.right.left == null && node.right.right == null){
            node.right = null;
        }
        removeLeaves(node.left);
        removeLeaves(node.right);

    }

    // Q_7
    // Breadth-First Search ( or Traversal) also know as Level Order Traversal.
    public void level(){
        level(root, "");
    }
    private void level(Node node, String line){
        if (node == null) {
            return;
        }

        System.out.print(line + node.value);

        level(node.left, line + "\n");
        level(node.right, line + "\n");

    }

    public void levelOrder() {

        Queue<Node> q = new LinkedList<>();

        if (root == null) {
            return;
        }

        q.add(root);

        Queue<Node> temp = new LinkedList<>();

        while (!q.isEmpty()) {

            Node n = q.remove();

            System.out.print(n.value + " ");

            if (n.left != null)
                temp.add(n.left);
            if (n.right != null)
                temp.add(n.right);

            if(q.isEmpty()){
                q.addAll(temp);
                System.out.println();

                Queue<Node> p = new LinkedList<>();
                temp = p;
            }
        }
    }

    // Q_8
    public void zigzag() {

        Queue<Node> q = new LinkedList<>();

        if (root == null) {
            return;
        }

        int point = 1;

        q.add(root);

        Queue<Node> temp = new LinkedList<>();

        while (!q.isEmpty()) {

            Node n = q.remove();

            System.out.print(n.value + " ");

            if(point % 2 == 0){
                if (n.right != null)
                    ((LinkedList<Node>) temp).addFirst(n.right);
                if (n.left != null)
                    ((LinkedList<Node>) temp).addFirst(n.left);
            }else{
                if (n.left != null)
                    ((LinkedList<Node>) temp).addFirst(n.left);
                if (n.right != null)
                    ((LinkedList<Node>) temp).addFirst(n.right);
            }

            if(q.isEmpty()){
                q.addAll(temp);
                System.out.println();
                point += 1;
                Queue<Node> p = new LinkedList<>();
                temp = p;
            }
        }
    }

    // Q_9
    public static BinaryTree treeUsingPreAndIn(int[] pre, int[] in){

        BinaryTree tree = new BinaryTree();

        tree.root = preAndIn(pre, in);
        return tree;
    }
    public static Node preAndIn(int[] pre, int[] in){

        if(pre.length == 0){
            return null;
        }
        int r = pre[0];
        int index = 0;

        for (int i = 0; i < in.length; i++) {
            if(in[i] == r){
                index = i;
            }
        }
        Node node = new Node(r);

        node.left = preAndIn(Arrays.copyOfRange(pre, 1, index + 1),
                Arrays.copyOfRange(in, 0, index));
        node.right = preAndIn(Arrays.copyOfRange(pre, index + 1, pre.length),
                Arrays.copyOfRange(in, index + 1, in.length));

        return node;
    }

    public static BinaryTree treeUsingPostAndIn(int[] pre, int[] in){

        BinaryTree tree = new BinaryTree();

        tree.root = postAndIn(pre, in);
        return tree;
    }
    public static Node postAndIn(int[] post, int[] in){
        if(post.length == 0){
            return null;
        }
        int r = post[post.length - 1];
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if(in[i] == r){
                index = i;
            }
        }
        Node node = new Node(r);
        node.left = postAndIn(Arrays.copyOfRange(post, 0, index),
                Arrays.copyOfRange(in, 0, index));
        node.right = postAndIn(Arrays.copyOfRange(post, index, post.length - 1),
                Arrays.copyOfRange(in, index + 1, in.length));

        return node;
    }
}
