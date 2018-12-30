package com.codingblocks;

import java.util.HashMap;
import java.util.Map;

public class Tries {

    private Node root;

    public Tries() {
        root = new Node(null);
    }

    public void insert(String word){
        insert(word, root);
    }
    private void insert(String word, Node node){
        if(word.isEmpty()){
            node.terminate = true;
            return;
        }

        char first = word.charAt(0);

        if(!node.map.containsKey(first)){
            node.map.put(first, new Node(first));
        }

        insert(word.substring(1), node.map.get(first));
    }

    public boolean findPrefix(String prefix){
        return findPrefix(prefix, root);
    }
    private boolean findPrefix(String prefix, Node node) {
        if(prefix.isEmpty()){
            return true;
        }

        char first = prefix.charAt(0);

        if(!node.map.containsKey(first)){
            return false;
        }

        return findPrefix(prefix.substring(1), node.map.get(first));
    }

    public boolean find(String word){
        return find(word, root);
    }
    private boolean find(String word, Node node) {
        if(word.isEmpty()){
            if (node.terminate){
                return true;
            }
            return false;
        }

        char first = word.charAt(0);

        if(!node.map.containsKey(first)){
            return false;
        }

        return find(word.substring(1), node.map.get(first));
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String processed) {

        if(node.terminate){
            System.out.println(processed);
        }

        for(Character value : node.map.keySet()){
            display(node.map.get(value), processed + value);
        }
    }

    public void displayPrefix(String prefix){
        displayPrefix(prefix, root, "");
    }

    private void displayPrefix(String prefix, Node node, String processed) {
        if(prefix.isEmpty()){
            display(node, processed);
            return;
        }

        char first = prefix.charAt(0);

        if(!node.map.containsKey(first)){
            return;
        }

        displayPrefix(prefix.substring(1), node.map.get(first), processed + first);
    }

    public void remove(String word){
        remove(word, root);
    }

    private void remove(String word, Node node) {

        if(word.isEmpty()){
            node.terminate = false;
            return;
        }

        char first = word.charAt(0);

        if(!node.map.containsKey(first)){
            return;
        }

        Node child = node.map.get(first);

        remove(word.substring(1), child);

        if(child.map.isEmpty() && !child.terminate){
            node.map.remove(child);
        }

    }

    private class Node{
        Character value;
        Map<Character, Node> map;

        boolean terminate;

        public Node(Character value) {
            this.value = value;
            this.map = new HashMap<>();
        }
    }

}
