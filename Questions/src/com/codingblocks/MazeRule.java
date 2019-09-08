package com.codingblocks;

import java.util.ArrayList;
import java.util.List;

public class MazeRule {
    public static List<List<Integer>> gridGame(List<List<Integer>> grid, int k, List<String> rules) {
        // Write your code here
        ArrayList<Integer> ruleIndices = new ArrayList<>();
        for (int i = 0; i < rules.size(); i++) {
            if(rules.get(i).compareTo("alive") == 0) {
                ruleIndices.add(i);
            }
        }

        List<List<Integer>> count = new ArrayList<>();
        for (int i = 0; i < grid.size(); i++) {
            count.add(new ArrayList<>());
        }
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(0).size(); j++) {
                int c = 0;
                // get neighbours of each cell
                if(i < grid.size()-1 && grid.get(i+1).get(j) == 1) {
                    c++;
                }
                if(i > 0 && grid.get(i-1).get(j) == 1) {
                    c++;
                }
                if(j < grid.get(0).size()-1 && grid.get(i).get(j+1) == 1) {
                    c++;
                }
                if(j > 0 && grid.get(i).get(j-1) == 1) {
                    c++;
                }
                if(i < grid.size()-1 && j < grid.get(0).size()-1 && grid.get(i+1).get(j+1) == 1) {
                    c++;
                }
                if(i < grid.size()-1 && j > 0 && grid.get(i+1).get(j-1) == 1) {
                    c++;
                }
                if(i > 0 && j > 0 && grid.get(i-1).get(j-1) == 1) {
                    c++;
                }
                if(i > 0 && j < grid.get(0).size()-1 && grid.get(i-1).get(j+1) == 1) {
                    c++;
                }

                // search in ruleIndices
                int index = ruleIndices.indexOf(c);
                if (index != -1) {
                    count.get(i).set(j,1);
                }

                // update the neighbours
                if(i < count.size()-1 && count.get(i+1).get(j) != 1) {
                    count.get(i+1).set(j, 0);
                }
                if(i > 0 && count.get(i-1).get(j) != 1) {
                    count.get(i-1).get(j);
                }
                if(j < count.get(0).size()-1 && count.get(i).get(j+1) != 1) {
                    count.get(i).set(j+1, 0);
                }
                if(j > 0 && count.get(i).get(j-1) != 1) {
                    count.get(i).set(j-1, 0);
                }
                if(i < count.size()-1 && j < count.get(0).size()-1 && count.get(i+1).get(j+1) != 1) {
                    count.get(i+1).set(j+1, 0);
                }
                if(i < count.size()-1 && j > 0 && count.get(i+1).get(j-1) != 1) {
                    count.get(i+1).set(j-1, 0);
                }
                if(i > 0 && j > 0 && count.get(i-1).get(j-1) != 1) {
                    count.get(i-1).set(j-1, 0);
                }
                if(i > 0 && j < count.get(0).size()-1 && count.get(i-1).get(j+1) != 1) {
                    count.get(i-1).set(j+1, 0);
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {

    }
}
