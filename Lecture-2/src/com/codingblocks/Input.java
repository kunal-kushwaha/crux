package com.codingblocks;

import java.util.Scanner;   // Class imported

public class Input {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //        Scanner s;  // will give initialising error

        // System is class, in is it's object
        // System.in for input (System.in is just saying from where do you want to take the input)
        // and System.out for output.
        // s is Reference. We can point it to another object.
        // new means create new object. 'new Scanner(System.in)' is object.
        // If we refer s to another object, old one will stop working.

        int n = s.nextInt();
        // This is waiting for System.in to input a number.
        // When you are calling s.nextInt(); you execute the method from the object you just created
        // this method returns a integer, so if we want to use that integer, we have to assign the call to a
        // variable like you do n = s.nextInt();
//        int n = 100;
        int sum = 0;
        while(n > 0){
            sum = sum + n;
            n = n - 1;
        }
        System.out.println(sum);
    }
}

// Explanation:
// Alright, let's elaborate with some simplified explanation about the Scanner class.
// It is a standard Oracle class which you can use by calling the import java.util.Scanner.
// So let's make a basic example of the class:
// class Scanner{
//     InputStream source;
//
//     Scanner(InputStream src){
//         this.source = src;
//     }
//
//     int nextInt(){
//         int nextInteger;
//         //Scans the next token of the input as an int from the source.
//         return nextInteger;
//     }
// }
// When you call Scanner input = new Scanner(System.in); you make a new object of the Scanner class
// (so you make a new "Scanner") and you store it in the variable input. At the same time you are calling the
// (so called) constructor of the class, with the parameter System.in. That means it is going to read from the
// standard input stream of the program.
// System.in within the round brackets tells Java that this will be System Input i.e. input will be given to the system.
// Now when you are calling input.nextInt(); you execute the method from the object you just created (also documented).
// But as we see, this method returns a integer, so if we want to use that integer,
// we have to assign the call to a variable like you do:
// int i = input.nextInt();
