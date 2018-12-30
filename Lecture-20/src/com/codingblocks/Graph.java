package com.codingblocks;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    private class Vertex{
        HashMap<String, Integer> nbrs = new HashMap<>();
    }

    HashMap<String, Vertex> vtces;

    public Graph() {
        this.vtces = new HashMap<>();
    }

    public int numVertex(){
        return vtces.size();
    }

    public boolean containsVertex(String vname){
        return vtces.containsKey(vname);
    }

    public void addVertex(String value){
        Vertex vertex = new Vertex();
        vtces.put(value, vertex);
    }

    public void removeVertex(String vname){

        Vertex vertex = vtces.get(vname);

        ArrayList<String> keys = new ArrayList<>(vertex.nbrs.keySet());

        for (String key : keys){
            Vertex neighbour = vtces.get(key);
            neighbour.nbrs.remove(vname);
        }

        vtces.remove(vname);

    }

    public void display(){

        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        for (String key : keys){

            Vertex vertex = vtces.get(key);

            System.out.println(key + " -> " + vertex.nbrs);
        }

    }

    public int numEdges(){
        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        int count = 0;

        for (String key : keys){
            Vertex vertex = vtces.get(key);

            count += vertex.nbrs.size();
        }
        return count / 2;   // Each edge is counted twice
    }

    public boolean containsEdge(String A, String B){
        Vertex first = vtces.get(A);
        Vertex second = vtces.get(B);

        if(first == null || second == null || !first.nbrs.containsKey(B)) {
            return false;
        }
        return true;
    }

    public void addEdge(String first, String second, int weight){
        Vertex f = vtces.get(first);
        Vertex s = vtces.get(second);

        if(f == null || s == null || f.nbrs.containsKey(second)){
            return;
        }

        f.nbrs.put(second, weight);
        s.nbrs.put(first, weight);
    }

    public void removeEdge(String first, String second){

        Vertex f = vtces.get(first);
        Vertex s = vtces.get(second);

        if(f == null || s == null || !f.nbrs.containsKey(second)){
            return;
        }

        f.nbrs.remove(second);
        s.nbrs.remove(first);
    }

    public boolean hasPath(String first, String second, HashMap<String, Boolean> visited){

        visited.put(first, true);

        if(containsEdge(first, second)){
            return true;
        }

        Vertex vertex = vtces.get(first);

        ArrayList<String> keys = new ArrayList<>(vertex.nbrs.keySet());

        for (String key : keys) {

            if(!visited.containsKey(key) && hasPath(key, second, visited)){
                return true;
            }
        }

        return false;
    }

}


