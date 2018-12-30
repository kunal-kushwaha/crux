package com.codingblocks;

public class StackClient {

    public static void main(String[] args) throws Exception{
        Stack stack = new Stack();

        stack.push(10);
        stack.push(134);
        stack.push(104);

        try{

            int b = 10;
            if(b == 10){
                throw new Exception();
            }

            int a = 1 / 0;  // will print 'go check your math'

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println("Will I be executed"); // because exception will be raised
        } catch (StackException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Go check your math " + e.getMessage());
        } catch (Exception e){
            System.out.println("b = 10");
        }

        System.out.println("What about me?");       // Yes, will be executed

    }
}
