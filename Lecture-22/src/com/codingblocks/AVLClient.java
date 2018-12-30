package com.codingblocks;

public class AVLClient {

    public static void main(String[] args) {
        AVL tree = new AVL();

        for (int i = 0; i < 10000; i++) {
            tree.insert(i+1);
        }
        System.out.println(tree.height());
    }

}
