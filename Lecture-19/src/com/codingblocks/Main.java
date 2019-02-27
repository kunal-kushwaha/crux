package com.codingblocks;

import sun.security.provider.certpath.Vertex;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        AdjacencyListGraph<Character> graph = new AdjacencyListGraph<>();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
//        graph.addVertex('E');

        graph.addVertex('F');

        graph.addEdge('A', 'B');
        graph.addEdge('A', 'C');
        graph.addEdge('C', 'D');
        graph.addEdge('A', 'D');

//        graph.addEdge('E', 'F');

//        graph.display();
//
//        System.out.println(graph.DFS('A'));
//        System.out.println(graph.BFS('B'));
//
//        graph.BFT();
//        graph.ShortPath();

//        graph.connectedComponents();

        graph.BFT();
        System.out.println(graph.bipartite());
//        graph.bipartite();
    }
}
