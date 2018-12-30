package com.codingblocks.patterns;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        for(int i=0; i<n; i++){
            for(int r=0; r<=i; r++){

                // Factorial:

                int fact_i = 1;

                for(int t = 1; t<=i ; t++){
                    fact_i = fact_i * t;
                }

                int fact_r = 1;

                for(int u = 1; u <= r; u++){
                    fact_r = fact_r * u;
                }

                int fact_ir = 1;

                for(int v=1; v <= (i-r); v++){
                    fact_ir = fact_ir * v;
                }

                int comb = fact_i/(fact_r * fact_ir);
                System.out.print(comb + "  ");
            }
            System.out.println();
        }
    }
}
