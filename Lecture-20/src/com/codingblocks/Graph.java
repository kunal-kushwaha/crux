package com.codingblocks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

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

    public void bft(){

        HashMap<String, Boolean> processed = new HashMap<>();

        LinkedList<Pair> queue = new LinkedList<>();

        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        // for every node repeat the process
        for(String key : keys){

            if(processed.containsKey(key)){
                continue;
            }

            // create a new pair
            Pair sp = new Pair();   // staring pair
            sp.vname = key;
            sp.psf = key;

            // put the new pair in queue

            queue.addLast(sp);

            while(!queue.isEmpty()){
                Pair rp = queue.removeFirst();  // removed pair

                if(processed.containsKey(rp.vname)){
                    continue;
                }

                processed.put(rp.vname, true);

                System.out.println(rp.vname + " via " + rp.psf);

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
        }
    }

    public void dft(){

        HashMap<String, Boolean> processed = new HashMap<>();

        LinkedList<Pair> stack = new LinkedList<>();

        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        // for every node repeat the process
        for(String key : keys){

            if(processed.containsKey(key)){
                continue;
            }

            // create a new pair
            Pair sp = new Pair();   // staring pair
            sp.vname = key;
            sp.psf = key;

            // put the new pair in queue

            stack.addFirst(sp);

            while(!stack.isEmpty()){
                Pair rp = stack.removeFirst();  // removed pair

                if(processed.containsKey(rp.vname)){
                    continue;
                }

                processed.put(rp.vname, true);

                System.out.println(rp.vname + " via " + rp.psf);

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
        }
    }

    public boolean isCyclic(){

        HashMap<String, Boolean> processed = new HashMap<>();

        LinkedList<Pair> queue = new LinkedList<>();

        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        // for every node repeat the process
        for(String key : keys){

            if(processed.containsKey(key)){
                continue;
            }

            // create a new pair
            Pair sp = new Pair();   // staring pair
            sp.vname = key;
            sp.psf = key;

            // put the new pair in queue

            queue.addLast(sp);

            while(!queue.isEmpty()){
                Pair rp = queue.removeFirst();  // removed pair

                if(processed.containsKey(rp.vname)){
                    return true;
                }

                processed.put(rp.vname, true);

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
        }
        return false;
    }

    public boolean isConnected(){

        int flag = 0;

        HashMap<String, Boolean> processed = new HashMap<>();

        LinkedList<Pair> queue = new LinkedList<>();

        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        // for every node repeat the process
        for(String key : keys){

            if(processed.containsKey(key)){
                continue;
            }

//          if graph is disconnected, we will come in this region more than once
            flag++;

            // create a new pair
            Pair sp = new Pair();   // staring pair
            sp.vname = key;
            sp.psf = key;

            // put the new pair in queue

            queue.addLast(sp);

            while(!queue.isEmpty()){
                Pair rp = queue.removeFirst();  // removed pair

                if(processed.containsKey(rp.vname)){
                    continue;
                }

                processed.put(rp.vname, true);

                System.out.println(rp.vname + " via " + rp.psf);

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
        }

        if(flag >= 2){
            return false;
        }
        return true;
    }

    public boolean isTree(){
        return (!isCyclic() && isConnected());
    }

    // get connected components
    public ArrayList<ArrayList<String>> gCC(){

        ArrayList<ArrayList<String>> finalans = new ArrayList<>();

        HashMap<String, Boolean> processed = new HashMap<>();

        LinkedList<Pair> queue = new LinkedList<>();

        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        // for every node repeat the process
        for(String key : keys){

            if(processed.containsKey(key)){
                continue;
            }

            // for new component create a new arraylist
            ArrayList<String> subans = new ArrayList<>();

            // create a new pair
            Pair sp = new Pair();   // staring pair
            sp.vname = key;
            sp.psf = key;

            // put the new pair in queue

            queue.addLast(sp);

            while(!queue.isEmpty()){
                Pair rp = queue.removeFirst();  // removed pair

                if(processed.containsKey(rp.vname)){
                    continue;
                }

                processed.put(rp.vname, true);

                // adding vertices of a component
                subans.add(rp.vname);

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

            // put in final answer
            finalans.add(subans);
        }
        return finalans;
    }

    private class PrimsPair implements Comparable<PrimsPair>{
        String vname;
        String acqvname;
        int cost;

        @Override
        public int compareTo(PrimsPair other) {
            return other.cost - this.cost;
        }
    }

    public Graph prims() throws Exception {

        Graph mst = new Graph();

        // We use this hasmap so that we can find neighbours in constant time
        HashMap<String, PrimsPair> map = new HashMap<>();

        Heap<PrimsPair> heap = new Heap<>();

        // make pairs and put in heap and map
        for(String key : vtces.keySet()){

            PrimsPair np = new PrimsPair();
            np.vname = key;
            np.acqvname = null;
            np.cost = Integer.MAX_VALUE;

            heap.add(np);
            map.put(key, np);
        }

        // till the heap is not empty, keep removing the pairs
        while(!heap.isEmpty()){

            // remove a pair
            PrimsPair rp = heap.remove();
            map.remove(rp.vname);

            // add to mst
            if(rp.acqvname == null){
                mst.addVertex(rp.vname);
            }else{
                mst.addVertex(rp.vname);
                mst.addEdge(rp.vname, rp.vname, rp.cost);
            }

            // for neighbours of rp
            for(String nbr : vtces.get(rp.vname).nbrs.keySet()){

                // work for neighbours which are in map
                if(map.containsKey(nbr)){

                    // old cost and new cost
                    int oc = map.get(nbr).cost;
                    int nc = vtces.get(rp.vname).nbrs.get(nbr);

                    // update the pair only when nc < oc
                    if(nc < oc){

                        PrimsPair gp = map.get(nbr);

                        // will be the same object which is in the heap, hence values in heap will also change
                        gp.acqvname = rp.vname;
                        gp.cost = nc;

                        // ALSO NEED TO DO UPHEAP NOW

                        heap.updatePriority(gp);

                    }



                }
            }




        }



        return mst;
    }

    private class DijkstraPair implements Comparable<DijkstraPair>{
        String vname;
        String psf;
        int cost;

        @Override
        public int compareTo(DijkstraPair other) {
            return other.cost - this.cost;
        }
    }

    public HashMap<String, Integer> dijkstra(String src) throws Exception {

        HashMap<String, Integer> ans = new HashMap<>();

        // We use this hasmap so that we can find neighbours in constant time
        HashMap<String, DijkstraPair> map = new HashMap<>();

        Heap<DijkstraPair> heap = new Heap<>();

        // make pairs and put in heap and map
        for(String key : vtces.keySet()){

            DijkstraPair np = new DijkstraPair();
            np.vname = key;
            np.psf = "";
            np.cost = Integer.MAX_VALUE;

            if(key.equals(src)){
                np.cost = 0;
                np.psf = key;
            }

            heap.add(np);
            map.put(key, np);
        }

        // till the heap is not empty, keep removing the pairs
        while(!heap.isEmpty()){

            // remove a pair
            DijkstraPair rp = heap.remove();
            map.remove(rp.vname);

            ans.put(rp.vname, rp.cost);

            // for neighbours of rp
            for(String nbr : vtces.get(rp.vname).nbrs.keySet()){

                // work for neighbours which are in map
                if(map.containsKey(nbr)){

                    // old cost and new cost
                    int oc = map.get(nbr).cost;
                    int nc = rp.cost + vtces.get(rp.vname).nbrs.get(nbr);

                    // update the pair only when nc < oc
                    if(nc < oc){

                        DijkstraPair gp = map.get(nbr);

                        // will be the same object which is in the heap, hence values in heap will also change
                        gp.psf = rp.psf + nbr;
                        gp.cost = nc;

                        // ALSO NEED TO DO UPHEAP NOW

                        heap.updatePriority(gp);

                    }
                }
            }
        }
        return ans;
    }



}


