package com.codingblocks;

import java.util.*;

// in this case, if collision happens, it will not override.

public class HashMapSeparateChain<K, V> {

    ArrayList<LinkedList<Entity>> list;

    private int size = 0;

    private float lf = 0.5f;
    // load factor = 0.5 means if we need to add 100 items and we have added
    // 50, then adding 51st item it will double the size, copy all elements
    // & then add 51st item.

    public HashMapSeparateChain() {
        list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value){
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        for(Entity entity : entities){
            if(entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }
        if((float)(size) / list.size() > lf){
            reHash();
        }
        entities.add(new Entity(key, value));

        size++;
    }


    private void reHash(){

        System.out.println("Now we are up for rehashing");
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        size = 0;

        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }
        for(LinkedList<Entity> entries : old){
            for(Entity entry : entries){
                put(entry.key, entry.value);
            }
        }

    }

    public V get(K key){

        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        for(Entity entity : entities){
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }

    public void remove(K key){
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        Entity target = null;

        for(Entity entity : entities){
            if(entity.key.equals(key)){
                target = entity;
                break;
            }
        }
        entities.remove(target);
        size--;
    }

    private class Entity{
        private K key;
        private V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public boolean containsKey(K key){
        return get(key) != null;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("{");
        for(LinkedList<Entity> entities : list){
            for (Entity entry : entities){
                builder.append(entry.key);
                builder.append(" = ");
                builder.append(entry.value);
                builder.append(", ");
            }
        }
        builder.append("}");

        return builder.toString();
    }

}
