package com.codingblocks;

public class Recursion {

    public static void main(String[] args) {
        printDec(4);
        System.out.println(factorial(5));
    }

    // Just for visualization
    public static void printDec4(){
        System.out.println(4);
        printDec3();
    }
    public static void printDec3(){
        System.out.println(3);
        printDec2();
    }
    public static void printDec2(){
        System.out.println(2);
        printDec1();
    }
    public static void printDec1(){
        System.out.println(1);
        printDec0();
    }
    public static void printDec0(){
        return;
    }
    // using recursion
    public static void printDec(int num){

        if(num == 0){
            return;
        }

        System.out.println(num);
        printDec(num - 1);
        System.out.println("returned");
    }
    public static void printInc(int num){

        if(num == 0){
            return;
        }
        printInc(num - 1);
        System.out.println(num);
    }
    public static void printIncDec(int num){

        if(num == 0){
            return;
        }

        System.out.println(num);
        printIncDec(num - 1);
        System.out.println(num);
    }

    public static int factorial(int num){
        if(num == 0)
            return 1;

        return(num*factorial(num-1));
    }

    public static int fibonacci(int num){

        if(num <= 0){
            return 0;
        }
        else if(num ==1 ){
            return 1;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }


    // If we use N-- in recursion, it will pass the value of N in the new function before subtracting it,
    // hence it will form infinite recursion i.e. stack overflow. Instead use --N
    public static void Test(int N){

        if(N == 0){
            return;
        }

        System.out.println(N);
        Test(--N);

    }
}
