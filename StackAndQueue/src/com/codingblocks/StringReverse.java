package com.codingblocks;

import java.util.Scanner;

// Time Complexity: O(N)
// Space Complexity: O(N)

// Yes we can do better (in constant space complexity) by not using stack (swap first and last elements method).

public class StringReverse {

    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);
        String str = input.next();

        Stack stack = new Stack(str.length());

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        stack.display();
        System.out.println();

        String processed = "";
        while(!stack.isEmpty()){
            processed = processed + stack.pop();
        }

        System.out.println(processed);
    }

}
