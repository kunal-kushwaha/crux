package com.codingblocks;

public class Human {

    static String name;
//    static int balance = 10000; // static will make this balance same for all the objects of class Human.
    int balance = 10000;
    final int hand;

    public static int population = 0;

    protected void hello(){
        System.out.println("Running protected method ");
    }
//    final balance = 10000;  // cannot be changed will give error if we try to change. For example nums.length we cannot change it
    // Means Array class have a final variable called length

    // static will make it object independent. hence no static cuz we need to use kunal's object.
    public int loan(){
        int t = balance / 10;
        balance = balance - t;

        System.out.println("Left with " + name + " " + balance);

        return t;
    }

    public void eat(){

        System.out.println("Welcome to Dhaba");

        if(balance < 100){
            System.out.println("Go home");
            return;
        }

        System.out.println("Eat Eat Eat");
        balance = balance - 100;
    }

    // constructor : Cannot be called by methods
//    public Human(int balance){
//        this.balance = balance;
//        this.hand = 2;
//    }
//    public Human(){
//        this.balance = 10000;
//        this.hand = 1;
//    }

    // calling constructor from constructor
    public Human(){

        this(10000);
    }

    public Human(int balance){
        this("kunal", balance);
    }
    public Human(String name, int balance){

        this.name = name;
        this.balance = balance;
        this.hand = 2;
        population++;
        System.out.println("Happy Birthday");
    }


    // copy constructor: similar to copy constructor

    public Human(Human old){

        this.name = old.name;
        this.balance = old.balance;
        this.hand = old.hand;
    }

    public void naamKaran(String name){

        this.name = name;       // no need to pass 'this' as argument

    }

    // will only run when java has to free ram. Garbage collector will hit when ram runs out and will destroy all the objects with no reference.
    // different than destructor because destructor runs when object gets over. Not in case of finalize().


    // Shortcut for this comes with finalize
    @Override
    protected void finalize() throws Throwable {
        super.finalize();

        System.out.println("Someone just died");
        population--;
    }

//    public static void fest(){
//        System.out.println("hurray");
//        this.loan();    // means we cannot call non-Static methods in static methods
//    }

}
