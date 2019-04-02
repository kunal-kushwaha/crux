package com.codingblocks.gssoc;

public class Main2 {

    public static void main(String[] args) {

        AdjacencyMapGraph graph = new AdjacencyMapGraph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");


        graph.addEdge("A", "B", 3);
        graph.addEdge("A", "D", 2);
        graph.addEdge("B", "C", 4);
        graph.addEdge("D", "C", 4);
        graph.addEdge("D", "E", 10);
        graph.addEdge("F", "E", 9);
        graph.addEdge("G", "E", 8);
        graph.addEdge("F", "G", 6);

        graph.display();

        System.out.println(graph.gCC());
    }


}
