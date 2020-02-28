package com.codingblocks.segmentTrees;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,2,-5,6,4};
        int n = arr.length;

        int[] tree = new int[4*n + 1]; // max size of tree will be (4*n + 1)

        buildTree(arr, 0, n-1, tree, 1);

        System.out.println(Arrays.toString(tree));
    }

    public static void buildTree(int[] a, int s, int e, int[] tree, int index) { // index is the index of nodes in tree
        if(s == e) {
            tree[index] = a[s];
            return;
        }

        int mid = (s + e) / 2;
        buildTree(a, s, mid, tree, 2 * index);
        buildTree(a, mid+1, e, tree, 2*index + 1);

        tree[index] = Math.min(tree[2*index], tree[2*index + 1]);
    }

    public static void update(int[] tree, int ss, int se, int i, int increment, int index) {
        // no overlap : out of bounds
        if(i > se || i < ss) {
            return;
        }

        // case of leaf node
        if(ss == se) {
            tree[index] += increment;
        }

        // partial overlap
        int mid = (ss + se) / 2;
        update(tree, ss, mid, i, increment, 2*index);
        update(tree, mid+1, se, i, increment, 2*index+1);

        tree[index] = Math.min(tree[2*index], tree[2*index + 1]);
    }

    // Range based search
    // ss = starting index of tree root node
    // qs = starting index of the query you want to search
    public static int query(int[] tree, int ss, int se, int qs, int qe, int index) {
        // complete overlap
        if(ss >= qs && se <= qe) {
            return tree[index];
        }

        // no overlap
        if(ss < qs || se < qe) {
            return Integer.MAX_VALUE;
        }

        // partial overlap : call both sides and update the current answer
        int mid = (ss + se) / 2;
        int leftAns = query(tree, ss, mid, qs, qe, 2*index);
        int rightAns = query(tree, mid + 1, se, qs, qe, 2 * index + 1);

        return Math.min(leftAns, rightAns);
    }

    public static void updateRange(int[] tree, int ss, int se, int l, int r, int increment, int index) {
        // out of bounds
        if(l > se || r < ss) {
            return;
        }
        if(ss == se) {
            tree[index] += increment;
        }

        // left and right
        int mid = (ss + se) / 2;
        updateRange(tree, ss, mid, l, r, increment, 2*index);
        updateRange(tree, mid + 1, se, l, r, increment, 2*index+1);

        tree[index] = Math.min(tree[2*index], tree[2*index + 1]);
    }
}
