package com.codingblocks;

public class Main {

    public static void main(String[] args) {

        AdjacencyMapGraph<Character> graph = new AdjacencyMapGraph<>();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');

//        graph.addEdge('A', 'C');
//        graph.addEdge('A', 'D');
//        graph.addEdge('C', 'B');
//        graph.addEdge('C', 'E');
//        graph.addEdge('E', 'D');

        graph.addEdgeWeight('A', 'B', 5);
        graph.addEdgeWeight('A', 'C', 15);
        graph.addEdgeWeight('A', 'D', 10);
        graph.addEdgeWeight('D', 'C', 5);
        graph.addEdgeWeight('D', 'E', 10);
        graph.addEdgeWeight('C', 'B', 10);
        graph.addEdgeWeight('C', 'E', 5);
        graph.addEdgeWeight('B', 'E', 15);

        graph.BFT();
        System.out.println(graph.mst());
        System.out.println(graph.prims());
    }
}
