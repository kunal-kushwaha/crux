package com.codingblocks.handy.exceptionHandling;

public class MultipleCatch {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            int c = a / b;
            if(b == 0);
        } catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        // When you use multiple catch statements, it is important to remember that exception subclasses must come
        // before any of their superclasses. This is because a catch statement that uses a superclass will catch
        // exceptions of that type plus any of its subclasses. Thus, a subclass would never be reached if it came after
        // its superclass. i.e. Don't put Exception before ArithmeticException
    }
}
