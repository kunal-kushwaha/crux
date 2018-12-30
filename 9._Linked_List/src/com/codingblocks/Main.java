package com.codingblocks;

public class Main {

    public static void main(String[] args) {

       LinkedListInt list = new LinkedListInt();

        for (int i = 1; i <= 6; i++) {
            list.insertLast(i);
        }

//        list.insertLast(3);
//        list.insertLast(4);
//        list.insertLast(5);
//        list.insertLast(2);
//        list.insertLast(6);
//        list.insertLast(1);
//        list.insertLast(9);
//        list.insertLast(10);
//        list.insertLast(11);
//        list.insertLast(18);
//

        list.display();

//        list.swap(5,9);
//        list.append(2);
//        System.out.println(list.palin());

//        list.oddEven();

//        list.rev();

        list.kRev(3);

        list.display();
    }
}
