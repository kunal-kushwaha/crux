package com.codingblocks;

import java.util.Scanner;

public class Q_8 {

    public static void main(String[] args) {

        lexoNumbers(0,130);

    }

    public static void lexoNumbers(int present, int target){

        if(present > target){
            return;
        }

        System.out.println(present);
        
        for (int i = 0; i < 10; i++) {

            if(present == 0 && i == 0){
                continue;
            }

            lexoNumbers(present*10 + i, target);
        }
    }
}
