package com.codingblocks.handy.generics;


// A simple generic class hierarchy.
class Gen<T> {
    T ob;
    Gen(T o) {
        ob = o;
    }
    // Return ob.
    T getob() {
        return ob; }
}


// The type parameter T is specified by Gen2 and is also passed to Gen in the extends clause.
// This means that whatever type is passed to Gen2 will also be passed to Gen.

// Thus, even if a subclass of a generic superclass would otherwise not need to be generic,
// it still must specify the type parameter(s) required by its generic superclass.

// A subclass of Gen.
//class Gen2<T> extends Gen<T> {
//    Gen2(T o) {
//        super(o);
//    }
//}
// OR
class Gen2 extends Gen<String> {    // This is fine but we expect Gen to have Object type here
                                    // (because String is not known at compile-time),
    // but this is solved with the help of BRIDGE METHODS. We can't see the implementation but a method is generated that
    // uses the type erasure of the superclass, and this method calls the method that has the type erasure specified by
    // he subclass.
    Gen2(String o) {
        super(o);
    }
}
// Thus, if you examine the class file for Gen2 by using javap, you will see the following methods:
//class Gen2 extends Gen<java.lang.String> {
//    Gen2(java.lang.String);
//    java.lang.String getob();
//    java.lang.Object getob(); // bridge method
//}

// Notice that the only difference between the two getob() methods is their return type. Normally, this would cause an error,
// but because this does not occur in your source code, it does not cause a problem and is handled correctly by the JVM.


// Of course, a subclass is free to add its own type parameters, if needed.
class Genn<T> {
    T ob; // declare an object of type T
    // Pass the constructor a reference to
    // an object of type T.
    Genn(T o) {
        ob = o;
    }
    // Return ob.
    T getob() {
        return ob; }
}

// A subclass of Gen that defines a second
// type parameter, called V.
class Genn2<T, V> extends Genn<T> {
    V ob2;
    Genn2(T o, V o2) {
        super(o);
        ob2 = o2;
    }
    V getob2() {
        return ob2;
    }
}

// Create an object of type Gen2.
class HierDemo {
    public static void main(String args[]) {
        // Create a Gen2 object for String and Integer.
        Genn2<String, Integer> x = new Genn2<>("Value is: ", 99);

        System.out.print(x.getob());
        System.out.println(x.getob2());
    }
}

public class GenericsHierarchies {

}
