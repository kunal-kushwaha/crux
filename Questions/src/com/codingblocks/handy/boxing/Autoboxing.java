package com.codingblocks.handy.boxing;

public class Autoboxing {

    public static void main(String[] args) {
        // Autoboxing is the process by which a primitive type is automatically encapsulated (boxed) into its equivalent
        // type wrapper whenever an object of that type is needed. There is no need to explicitly construct an object.
        // Auto-unboxing is the process by which the value of a boxed object is automatically extracted (unboxed) from a
        // type wrapper when its value is needed. There is no need to call a method such as intValue() or doubleValue().

        Integer iOb = 100; // autobox an int
        // Notice that the object is not explicitly created through the use of new. Java handles this automatically.

        int i = iOb; // auto-unbox

        System.out.println("Original value of iOb: " + iOb);
        // The following automatically unboxes iOb,
        // performs the increment, and then reboxes
        // the result back into iOb.
        ++iOb;
        System.out.println("After ++iOb: " + iOb);

        // The same expression is evaluated, but the
        // result is not reboxed.
        i = iOb + (iOb / 3);
        System.out.println("i after expression: " + i);

        //Because of auto-unboxing, a Boolean object can now also be used to control any of Java’s loop statements.
        // When a Boolean is used as the conditional expression of a while, for, or do/while, it is automatically
        // unboxed into its boolean equivalent. For example, this is now perfectly valid code:

        Boolean b = true;
        // ...
        while(b) { /* ... */ }

        // In general, you should restrict your use of the type wrappers to only those cases in which an object
        // representation of a primitive type is required. Autoboxing/unboxing was not added to Java as a “back door”
        // way of eliminating the primitive types.

    }

}
