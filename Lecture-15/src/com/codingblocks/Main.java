package com.codingblocks;

import java.io.File;
import java.io.PrintStream;
import java.util.*;

public class Main {

    public static File output = new File("output.txt");
    public static PrintStream out;

    public static void main(String[] args) throws Exception { // Can throw exception if file doesn't exist

        out = new PrintStream(output);

        BinaryTree tree = new BinaryTree();

        File input = new File("input.txt");
        File output = new File("output.txt");
        // this is why we passed Scanner as argument so that we can take input in any way we want.

        tree.populate(new Scanner(input));
        tree.display();
        System.out.println(tree.largest());

//        PrintStream out = new PrintStream(output);
//        out.println("Hello World");
//
//        tree.printLevel(2);
//        System.out.println(tree.find(20));
//
//        int[] pre = {10, 20, 15, 13, 12};
//        int[] in = {15, 20, 13, 10, 12};
//        int[] post = {15, 30, 20, 12, 10};
//
//        BinaryTree tree2 = BinaryTree.treeUsingPreAndIn(pre, in);
//        BinaryTree tree2 = BinaryTree.treeUsingPostAndIn(post, in);
//
//        tree2.display();

    }

}
