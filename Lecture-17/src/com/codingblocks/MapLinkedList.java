package com.codingblocks;

import java.util.LinkedList;

public class MapLinkedList {

    LinkedList<Entity> entities = new LinkedList<>();

    // Just to understand. This is inefficient ofc.

    public String get(String key){
        for(Entity entity : entities){
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }

    public void put(String key, String value){

        for(Entity entity : entities){
            if(entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }
        entities.add(new Entity(key, value));
    }

    public void remove(String key){

        Entity target = null;

        // because you cannot remove while traversing like this
        for(Entity entity : entities){
            if(entity.key.equals(key)){
                target = entity;
                break;
            }
        }
        entities.remove(target);
    }

    @Override
    public String toString(){

        String s = "";
        s += "{";
        for(Entity entity : entities){
            s += entity.key + " = " + entity.value;
        }
        s += "}";
        return s;
    }

    private class Entity{

        private String key;
        private String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
