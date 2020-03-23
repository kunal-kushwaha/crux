package com.codingblocks.handy.javaLibrary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class collectionIterator {

    public static void main(String[] args) {

        // ‘Iterator’ is an interface which belongs to Collection framework. It allows us to traverse the collection,
        // access the data element and remove the data elements of the collection.

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Iterator to traverse the list
        Iterator iterator = list.iterator();

        System.out.print("List elements : ");

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();

    }

    // The Iterable interface is the root interface for all the collection classes.
    // The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface
    // also implement the Iterable interface.
    // It contains only one abstract method. i.e.,
    // Iterator<T> iterator()
    // which returns the iterator over the elements of type T.


// An Iterable is a simple representation of a series of elements that can be iterated over.
//    Example: ArrayList, Etc are iterables.
// It does not have any iteration state such as a "current element".Instead,it has one method that produces an Iterator.
// An Iterator is the object with iteration state. It lets you check if it has more elements using hasNext() and move
// to the next element (if any) using next().
//    Example: when we do list.iterable(); it creates an iterable object which can be iterated over.




//    An implementation of Iterable is one that provides an Iterator of itself:
//
//    public interface Iterable<T>
//    {
//        Iterator<T> iterator();
//    }
//    An iterator is a simple way of allowing some to loop through a collection of data without assignment privileges
//    (though with ability to remove).
//
//    public interface Iterator<E>
//    {
//        boolean hasNext();
//        E next();
//        void remove();
//    }

}
