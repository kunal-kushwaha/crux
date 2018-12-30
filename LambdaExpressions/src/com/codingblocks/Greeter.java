package com.codingblocks;

public class Greeter {

    public void greet(Greeting greeting) { // greet method is accepting a behaviour as an argument
        greeting.perform();
    }
    // here we are passing a thing that has the behaviour, we aren't passing
    // the behaviour

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting helloworldgreeting = new HelloWorldGreeting();
        greeter.greet(helloworldgreeting);
        // here we are passing a behaviour in the greet method.
        // we can create a new implementation of Greeting() and have it do something else.
        // this is just classic oops

        MyLambda myLambdaFunction = () -> System.out.println("Hello World");
        // Or
        Greeting myLambdaFunction2 = () -> System.out.println("Hello World");


        MyAdd addFunction = (int a, int b) -> a + b;

        Greeting innerClassGreeting = new Greeting(){
            @Override
            public void perform() {
                System.out.println("Hello World");
            }
        };
        // This is an inline implementation of an interface. aka Anonymous inner class. It doesn't have a name,
        // hence it is anonymous. This is same as (not exactly because inner classes do some things lambdas don't):
        // Greeting myLambdaFunction2 = () -> System.out.println("Hello World");

        greeter.greet(myLambdaFunction2);
        greeter.greet(innerClassGreeting);
    }

    // To provide the "type" of the function, we need to give java the information to figure out what the type of the
    // lambda expression is, we do this by using interface.

    interface MyLambda {
        void foo();
//        void sum(int a, int b);   // Error
//        void d(); // Error
    }
    // This is same as when we created the Greeting Interface

    interface MyAdd {
        int sum(int a, int b);
    }



}
