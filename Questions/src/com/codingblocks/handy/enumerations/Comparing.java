package com.codingblocks.handy.enumerations;

public class Comparing {

    enum Day {
        MON,
        TUE,
        WED,
        THU,
        FRI,
        SAT,
        SUN
    }
    enum Month {
        JAN,
        FEB,
        MAR,
        APR,
        MAY,
        JUN,
        JULY
    }

    public static void main(String[] args) {
        Day d = null;

        Day a = Day.MON;
        Day b = Day.THU;
        Day c = Day.MON;


//        // Comparing an enum member with null
//        // using == operator
        System.out.println(d == a);
//
//        // Comparing an enum member with null
//        // using .equals() method
//        System.out.println(d.equals(Day.MON));  // NullPointException

//        System.out.println(Day.MON == Month.APR); // Compile Error

        System.out.println(a.equals(Month.APR));

        // Compares on the basis on INDEX values
        // Remember, both the invoking constant and e must be of the same enumeration :
        System.out.println(a.compareTo(b));

        System.out.println(a.equals(c));
        System.out.println(a == c);


    }
}
