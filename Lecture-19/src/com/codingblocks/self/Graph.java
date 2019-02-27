package com.codingblocks.self;

import java.util.*;

public class Graph {

    LinkedList<Vertex> vertices;

    public Graph() {
        vertices = new LinkedList<>();
    }

    public void addVertex(String value){
        Vertex vertex = new Vertex(value);
        vertices.add(vertex);
    }

    public Vertex get(String value){
        for (Vertex vertex : vertices) {
            if(vertex.value.equals(value)){
                return vertex;
            }
        }
        return null;
    }

    public void addEdge(String first, String second){

        Vertex one = get(first);
        Vertex two = get(second);

        if(one != null && two != null){
            one.neighbours.add(two);
            two.neighbours.add(one);
        }
    }

    public boolean bfs(String value){

        Vertex first = vertices.get(0);

        Set<Vertex> processed = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        processed.add(first);
        queue.add(first);

        while(!queue.isEmpty()){

            Vertex front = queue.remove();

            if(front.neighbours.contains(get(value))){
                return true;
            }

            for(Vertex vertex : front.neighbours){
                if(!processed.contains(vertex)){
                    processed.add(vertex);
                    queue.add(vertex);
                }
            }
        }
        return false;

    }

    public boolean dfs(String value){

        Vertex front = vertices.get(0);

        Set<Vertex> processed = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        processed.add(front);
        stack.add(front);


        while(!stack.isEmpty()){

            Vertex top = stack.pop();

            if(top.neighbours.contains(get(value))){
                return true;
            }

            for(Vertex neighbour : top.neighbours){
                if(!processed.contains(neighbour)){
                    processed.add(neighbour);
                    stack.push(neighbour);
                }
            }
        }
        return false;
    }


    class Vertex {
        String value;
        LinkedList<Vertex> neighbours;

        public Vertex(String value) {
            this.value = value;
            this.neighbours = new LinkedList<>();
        }
    }

}
