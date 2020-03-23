package com.codingblocks.handy.boxing;

public class TypeWrappers {
    public static void main(String[] args) {
        //By far, the most commonly used type wrappers are those that represent numeric values. These are Byte, Short, Integer, Long, Float, and Double. All of the numeric type wrappers inherit the abstract class Number. Number declares methods that return the value of an object in each of the different number formats. These methods are shown here:
        //byte byteValue( ) double doubleValue( ) float floatValue( )
        //int intValue( )
        //long longValue( ) short shortValue( )

        //These methods are implemented by each of the numeric type wrappers.

//        Integer iOb = new Integer("HEY");   // NumberFormatException

        Integer iOb = new Integer(46);  // BOXING
        int i = iOb.intValue();                // UNBOXING

        System.out.println(iOb + i);    // 92
        System.out.println(iOb + " " + i); // 46 46
    }
}
