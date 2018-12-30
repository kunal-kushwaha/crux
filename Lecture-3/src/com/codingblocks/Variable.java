package com.codingblocks;

public class Variable {

    public static void main(String[] args) {
//    int age = 20;
//    long val = age; //automatic casting

    // but
    long val = 5473627623625622l;   // put l in last to make it long // put f in last to make it float
    float a = val;
        System.out.println(a);  //5.4736277E15
    // this will alter value, so convert it into double because float will round it off.
    double b = val;

    // boolean cannot be converted into any other type.

    // char can be converted into int:
    // it will use the unicode value
        System.out.println('a' + 0);    // 97
    }
}
