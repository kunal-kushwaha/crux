package com.codingblocks;

public class Main {

    public static void main(String[] args) {

        Tries tries = new Tries();

        tries.insert("anuj");
        tries.insert("anant");
        tries.insert("neha");
        tries.insert("nishant");

        System.out.println(tries.findPrefix("ne"));
        System.out.println(tries.find("anuj"));
        System.out.println(tries.find("kunal"));

        System.out.println();
        tries.display();

        tries.remove("anant");

        System.out.println();
        tries.display();

        System.out.println();
        tries.displayPrefix("an");
    }
}
