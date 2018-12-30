package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Human kunal = new Human();
        Human rahul = new Human(20000);
        // new Human(); is object
        // kunal is reference
        // lhs (kunal): compiler looks for reference, rhs: JVM looks for object
        System.out.println(kunal);      // shows hashcode location of the object OUTPUT(com.codingblocks.Human@60e53b93)

        System.out.println(kunal.name);     // by default null

        kunal.name = "Kunal Kushwaha";
        // OR
        kunal.naamKaran("Kunal Kushwaha");

        System.out.println(kunal.name);     // (Kunal Kushwaha)

        System.out.println(kunal.balance);

        kunal.loan();
        kunal.loan();
        kunal.loan();

        Human abhi = new Human();
        abhi.name = "Abhishek";

        abhi.loan();            // will use the balance left with kunal if balance is static variable

        System.out.println(kunal.name);     // will change to abhishek if name is static variable

        kunal.eat();


        for (int i = 0; i < 1000; i++) {

            Human h = new Human();
//            h.finalize(); // will not destroy objects. doesnt care if we have executed this function manually.
        }

//        load();  // raises error
    }

    public void load(){

    }

}
