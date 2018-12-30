package com.codingblocks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
//
//        tree.display();
//
//        System.out.println("SUM : " + tree.sum());
//

//        BinaryTree tree1 = new BinaryTree();
//        BinaryTree tree2 = new BinaryTree();
//
//        tree1.populate(scanner);
//        tree2.populate(scanner);
//
//        System.out.println(BinaryTree.identical(tree1, tree2));

//        System.out.println(tree.balanced());

//        tree.noSibling();
//
//        tree.removeLeaves();
//        System.out.println("LEAVES REMOVED: ");

        System.out.println("\n\n");
        tree.display();

//        ArrayList<LinkedList> list = tree.create();
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        tree.levelOrder();
//        System.out.println();
//        tree.zigzag();
    }

}
