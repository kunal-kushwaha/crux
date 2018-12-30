package com.codingblocks;

public class Q_10 {
    public static void main(String[] args) {
        armRange(100, 1000);
    }
    public static void armRange(int n1, int n2){
        for (int i = n1; i < n2; i++) {
            if(Q_9.arm(i))
                System.out.println(i);
        }
    }
}
