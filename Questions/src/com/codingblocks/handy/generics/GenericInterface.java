package com.codingblocks.handy.generics;

interface MinMax<T extends Comparable<T>>{
    T min();
    T max();
}

// Pay special attention to the way that the type parameter T is declared by MyClass and then passed to MinMax.
// Because MinMax requires a type that implements Comparable, the implementing class (MyClass in this case)
// must specify the same bound.
// In general, if a class implements a generic interface, then that class must also be generic,
// at least to the extent that it takes a type parameter that is passed to the interface.
// OR
// class MyClass implements MinMax<Integer> { // OK
class MyClass<T extends Comparable<T>> implements MinMax<T>{

    T[] vals;
    MyClass(T[] o) { vals = o; }
    // Return the minimum value in vals.
    public T min() {
        T v = vals[0];
        for(int i=1; i < vals.length; i++)
            if(vals[i].compareTo(v) < 0) v = vals[i];
        return v; }
    // Return the maximum value in vals.
    public T max() {
        T v = vals[0];
        for(int i=1; i < vals.length; i++)
            if(vals[i].compareTo(v) > 0) v = vals[i];
        return v; }
}

public class GenericInterface {

    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6 };
        Character chs[] = {'b', 'r', 'p', 'w' };

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println(iob.min());
        System.out.println(iob.max());

        System.out.println(cob.min());
        System.out.println(cob.max());

    }
}
