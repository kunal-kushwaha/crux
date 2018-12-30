package com.codingblocks;

import java.util.*;

public class AdjacencyMapGraph<T> {

    private Map<T, Vertex> vertexMap;

    private Map<Vertex, Vertex> parents;

    public void refreshUnion(){
        parents = new HashMap<>();
        for(Vertex vertex : vertexMap.values()){
            parents.put(vertex, null);
        }
    }

    public Vertex find(Vertex vertex){
        while(parents.get(vertex) != null){
            vertex = parents.get(vertex);
        }
        return vertex;
    }

    public void union(Vertex first, Vertex second){
        parents.put(find(first), find(second));
    }

    public AdjacencyMapGraph() {
        vertexMap = new HashMap<>();
    }

    public void addVertex(T value){
        if(!vertexMap.containsKey(value)){
            Vertex vertex = new Vertex(value);
            vertexMap.put(value, vertex);
        }
    }

    public void addEdge(T first, T second){
        if(vertexMap.containsKey(first) && vertexMap.containsKey(second)){
            vertexMap.get(first).addNeighbour(second, 1);
            vertexMap.get(second).addNeighbour(first, 1);
        }
    }

    public void addEdgeWeight(T first, T second, int weight){
        if(vertexMap.containsKey(first) && vertexMap.containsKey(second)){
            vertexMap.get(first).addNeighbour(second, weight);
            vertexMap.get(second).addNeighbour(first, weight);
        }
    }

    public void BFT(){

        if(vertexMap.isEmpty()){
            return;
        }

        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> processed = new HashSet<>();

        Vertex vertex = vertexMap.values().iterator().next();

        queue.add(vertex);
        processed.add(vertex);

        while(!queue.isEmpty()){
            Vertex front = queue.remove();

            System.out.println(front.value);

            for (Vertex neighbour : front.neighbours.keySet()) {
                if(!processed.contains(neighbour)){
                    processed.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
    }

    // Minimum spanning trees
    // Kruskal's algorithm
    public int mst(){

        refreshUnion();

        LinkedList<Edge> result = new LinkedList<>();

        int mst_sum = 0;

        ArrayList<Edge> edges = new ArrayList<>();
        for(Vertex vertex : vertexMap.values()){
            for(Vertex neighbour : vertex.neighbours.keySet()){
                edges.add(new Edge(vertex, neighbour, vertex.neighbours.get(neighbour)));
            }
        }
        edges.sort(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.weight - o2.weight;
            }
        });

        for(Edge edge : edges){
            if(find(edge.first) != find(edge.second)){
                result.add(edge);
                union(edge.first, edge.second);
                mst_sum += edge.weight;
            }
        }
//        return result;
        return mst_sum;
    }

    public AdjacencyMapGraph<T> mstgraph(){

        refreshUnion();

        LinkedList<Edge> result = new LinkedList<>();

        int mst_sum = 0;

        ArrayList<Edge> edges = new ArrayList<>();
        for(Vertex vertex : vertexMap.values()){
            for(Vertex neighbour : vertex.neighbours.keySet()){
                edges.add(new Edge(vertex, neighbour, vertex.neighbours.get(neighbour)));
            }
        }
        edges.sort(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.weight - o2.weight;
            }
        });

        for(Edge edge : edges){
            if(find(edge.first) != find(edge.second)){
                result.add(edge);
                union(edge.first, edge.second);
                mst_sum += edge.weight;
            }
        }

        AdjacencyMapGraph<T> graph = new AdjacencyMapGraph<>();

        for(Edge edge : result){
            if(!graph.vertexMap.containsKey(edge.first.value)){
                graph.vertexMap.put(edge.first.value, edge.first);
            }
            if(!graph.vertexMap.containsKey(edge.second.value)){
                graph.vertexMap.put(edge.second.value, edge.second);
            }

            graph.addEdgeWeight(edge.first.value, edge.second.value, edge.weight);
        }
        return graph;
    }

    public int prims(){

        refreshUnion();

        if(vertexMap.isEmpty()){
            return 0;
        }

        int sum = 0;

        Set<Vertex> visited = new HashSet<>();

        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();

        Vertex vertex = vertexMap.values().iterator().next();

        visited.add(vertex);

        for(Vertex neighbour : vertex.neighbours.keySet()){
            priorityQueue.add(new Edge(vertex, neighbour, vertex.neighbours.get(neighbour)));
        }
        while(!priorityQueue.isEmpty()){
            Edge front = priorityQueue.remove();
            if(visited.contains(front.first) && visited.contains(front.second)){
                continue;
            }
            sum += front.weight;

            if(!visited.contains(front.first)){
                for(Vertex neighbour : front.first.neighbours.keySet()){
                    priorityQueue.add(new Edge(front.first, neighbour, front.first.neighbours.get(neighbour)));
                }
                visited.add(front.first);
            }
            if(!visited.contains(front.second)){
                for(Vertex neighbour : front.second.neighbours.keySet()){
                    priorityQueue.add(new Edge(front.second, neighbour, front.second.neighbours.get(neighbour)));
                }
                visited.add(front.second);
            }
        }
        return sum;
    }

    // Dijkstra’s shortest path algorithm
    public Map<T, Integer> dijkstra(T s){
        Vertex start = vertexMap.get(s);

        Map<T, Integer> result = new HashMap<>();

        Set<Vertex> visited = new HashSet<>();

        visited.add(start);

        PriorityQueue<DJPair> queue = new PriorityQueue<>();

        for(Vertex neighbour : start.neighbours.keySet()){
            queue.add(new DJPair(neighbour, start.neighbours.get(neighbour)));
        }

        while(!queue.isEmpty()){
            DJPair front = queue.remove();
            result.put(front.node.value, front.distance);

            visited.add(front.node);

            for (Vertex neighbour : front.node.neighbours.keySet()) {
                if(!visited.contains(neighbour)){
                    for(DJPair pair : queue){
                        if(pair.node.equals(neighbour)){
                            // COMPLETE
                        }
                    }
                }
            }
        }
        return result;
    }

    private class DJPair implements Comparable<DJPair>{
        private Vertex node;
        private int distance;

        public DJPair(Vertex node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(DJPair o) {
            return this.distance - o.distance;
        }
    }

    private class Vertex{
        private T value;

        private Map<Vertex, Integer> neighbours;

        public Vertex(T value) {
            this.value = value;
            neighbours = new HashMap<>();
        }

        public void addNeighbour(T value, int weight){
            neighbours.put(vertexMap.get(value), weight);
        }
    }

    private class Edge implements Comparable<Edge>{
        Vertex first;
        Vertex second;
        int weight;

        public Edge(Vertex first, Vertex second, int weight) {
            this.first = first;
            this.second = second;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }

}
