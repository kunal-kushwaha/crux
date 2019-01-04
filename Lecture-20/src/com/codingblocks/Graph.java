package com.codingblocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

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

    private class Pair{
        String vname;
        String psf; // path so far
    }
    public boolean bfs(String source, String destination){

        HashMap<String, Boolean> processed = new HashMap<>();

        LinkedList<Pair> queue = new LinkedList<>();

        // create a new pair
        Pair sp = new Pair();   // staring pair
        sp.vname = source;
        sp.psf = source;

        // put the new pair in queue

        queue.addLast(sp);

        while(!queue.isEmpty()){
            Pair rp = queue.removeFirst();  // removed pair

            if(processed.containsKey(rp.vname)){
                continue;
            }

            processed.put(rp.vname, true);

            if(containsEdge(rp.vname, destination)){
                System.out.println(rp.psf + destination);
                return true;
            }

            // neighbours

            Vertex rpvtx = vtces.get(rp.vname);
            ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

            for(String nbr : nbrs){

                // process only unprocessed neighbours
                if(!processed.containsKey(nbr)){
                    Pair np = new Pair();
                    np.vname = nbr;
                    np.psf = rp.psf + nbr;

                    queue.addLast(np);
                }
            }
        }

        return false;
    }

    // just change queue in bfs to stack and change addLast to addFirst
    public boolean dfs(String source, String destination){

        HashMap<String, Boolean> processed = new HashMap<>();

        LinkedList<Pair> stack = new LinkedList<>();

        // create a new pair
        Pair sp = new Pair();   // staring pair
        sp.vname = source;
        sp.psf = source;

        // put the new pair in queue

        stack.addFirst(sp);

        while(!stack.isEmpty()){
            Pair rp = stack.removeFirst();  // removed pair

            if(processed.containsKey(rp.vname)){
                continue;
            }

            processed.put(rp.vname, true);

            if(containsEdge(rp.vname, destination)){
                System.out.println(rp.psf + destination);
                return true;
            }

            // neighbours

            Vertex rpvtx = vtces.get(rp.vname);
            ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

            for(String nbr : nbrs){

                // process only unprocessed neighbours
                if(!processed.containsKey(nbr)){
                    Pair np = new Pair();
                    np.vname = nbr;
                    np.psf = rp.psf + nbr;

                    stack.addFirst(np);
                }
            }
        }

        return false;
    }

}


