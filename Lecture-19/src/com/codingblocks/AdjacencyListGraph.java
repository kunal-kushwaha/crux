package com.codingblocks;

import java.util.*;

public class AdjacencyListGraph <T> {

    private LinkedList<Vertex> vertices;

    public AdjacencyListGraph() {
        vertices = new LinkedList<>();
    }

    public void addVertex(T value){
        vertices.add(new Vertex((value)));
    }

    public void addEdge(T first, T second){
        Vertex f = get(first);
        Vertex s = get(second);

        if(f != null && s != null){
            f.neighbours.add(s);
            s.neighbours.add(f);
        }
    }
    
    public void display(){
        for(Vertex vertex : vertices){
            System.out.print(vertex.value + " -> ");
            for(Vertex neighbour : vertex.neighbours){
                System.out.print(neighbour.value + " ");
            }
            System.out.println();
        }
    }

    private Vertex get(T value){
        for(Vertex vertex : vertices){
            if(vertex.value.equals(value)){
                return vertex;
            }
        }
        return null;
    }

    public boolean DFS(T value){

        if(vertices.isEmpty()){
            return false;
        }

        Vertex vertex = vertices.get(0);

        Set<Vertex> processed = new HashSet<>(); // so that we don't add same value again in stack
        Stack<Vertex> stack = new Stack<>();

        processed.add(vertex);
        stack.push(vertex);

        while(!stack.isEmpty()){
            Vertex top = stack.pop();

            if(top.value.equals(value)){
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

    public boolean BFS(T value){

        if(vertices.isEmpty()){
            return false;
        }

        Vertex vertex = vertices.get(0);

        Set<Vertex> processed = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        processed.add(vertex);
        queue.add(vertex);

        while(!queue.isEmpty()){
            Vertex front = queue.remove();

            if(front.value.equals(value)){
                return true;
            }

            for(Vertex neighbour : front.neighbours){
                if(!processed.contains(neighbour)){
                    processed.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
        return false;
    }
    public void BFT(){

        Vertex vertex = vertices.get(0);

        Set<Vertex> processed = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        processed.add(vertex);
        queue.add(vertex);

        while(!queue.isEmpty()){
            Vertex front = queue.remove();

            System.out.println(front.value);

            for(Vertex neighbour : front.neighbours){
                if(!processed.contains(neighbour)){
                    processed.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
    }

    public void connectedComponents(){

        Set<Vertex> processed = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        for(Vertex vertex : vertices){
            if(processed.contains(vertex)){
                continue;
            }

            processed.add(vertex);
            queue.add(vertex);

            while(!queue.isEmpty()){
                Vertex front = queue.remove();

                System.out.print(front.value + " ");

                for(Vertex neighbour : front.neighbours){
                    if(!processed.contains(neighbour)){
                        processed.add(neighbour);
                        queue.add(neighbour);
                    }
                }
            }

            System.out.println();
        }
    }

    public LinkedList<LinkedList<Vertex>> connectedComponentsLL(){

        Set<Vertex> processed = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        LinkedList<LinkedList<Vertex>> list = new LinkedList<>();

        for(Vertex vertex : vertices){
            if(processed.contains(vertex)){
                continue;
            }

            processed.add(vertex);
            queue.add(vertex);

            LinkedList<Vertex> level = new LinkedList<>();

            while(!queue.isEmpty()){
                Vertex front = queue.remove();

                level.add(front);

                for(Vertex neighbour : front.neighbours){
                    if(!processed.contains(neighbour)){
                        processed.add(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
            list.add(level);
        }
        return list;
    }

    // bipartite
    public boolean bipartite(){
        Vertex vertex = vertices.get(0);

        LinkedList<Vertex> red = new LinkedList<>();
        LinkedList<Vertex> green = new LinkedList<>();

        Set<Vertex> processed = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        processed.add(vertex);
        queue.add(vertex);
        red.add(vertex);

        while(!queue.isEmpty()){
            Vertex front = queue.remove();

            if(red.contains(front)){
                for(Vertex neighbour : front.neighbours){

                    if(processed.contains(neighbour)){
                        if(red.contains(neighbour)){
                            return false;
                        }
                    }else{
                        if (!green.contains(neighbour)){
                            green.add(neighbour);
                            queue.add(neighbour);
                        }
                    }
                }
            }

            if(green.contains(front)){

                for(Vertex neighbour : front.neighbours){
                    if(processed.contains(neighbour)){
                        if(green.contains(neighbour)){
                            return false;
                        }
                    }else{
                        if (!red.contains(neighbour)){
                            red.add(neighbour);
                            queue.add(neighbour);
                        }
                    }
                }
            }
        }
        return true;
    }

    public void ShortPath(){

        Vertex vertex = vertices.get(0);

        int level = 0;

        Set<Vertex> processed = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        processed.add(vertex);
        queue.add(vertex);
        queue.add(null);

        while(queue.size() > 1){
            Vertex front = queue.remove();

            if(front == null){
                queue.add(null);
                level++;
                continue;
            }

            System.out.println(front.value + " with level " + level);

            for(Vertex neighbour : front.neighbours){
                if(!processed.contains(neighbour)){
                    processed.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
    }

    private class Vertex{
        private T value;
        private LinkedList<Vertex> neighbours;

        public Vertex(T value) {
            this.value = value;
            neighbours = new LinkedList<>();
        }
    }

}
