package com.codingblocks;

import java.util.ArrayList;
import java.util.Scanner;

class Player{
    String name;
    String type;
    float price;
    Player(String name, String type, float price){
        this.name = name;
        this.type = type;
        this.price = price;
    }
}

public class Cricket {

/*
a wk 10 b wk 9.5 c wk 8 d wk 8 e bm 11 f bm 10.5 g bm 9.5 h bm 9 i bm 9 j bm 9 k bm 8.5 l bm 8.5 m bm 8.5 n bm 8.5 o bm 8 p bm 8 q bm 8 r bm 8 s bm 9 t ar 9 u ar 8.5 v ar 8.5
 */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Player[] team = new Player[22];

        for (int i = 0; i < team.length; i++) {
            String name = s.next();
            String type = s.next();
            float price = s.nextFloat();
            team[i] = new Player(name, type, price);
        }

        int budget = 100;

        System.out.println(knapsack(11, budget, team, 0));

    }
    public static float knapsack(int bag, float budget, Player[] team, int index){

        if(bag == 0 || index == team.length){
            return 0;
        }

        float accept = 0;
        if(budget >= team[index].price){
            accept = team[index].price + knapsack(bag-1, budget - team[index].price, team,index + 1);
        }
        float reject = knapsack(bag, budget, team,index + 1);

        return Math.min(accept, reject);

    }

}
