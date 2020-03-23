package com.codingblocks.handy;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            String u=s.next();
            System.out.println(u);
        }
    }

    public static String  pie(String u,int m,String s){
        if(m==u.length()-1){
            return u;
        }
        char ch=u.charAt(m);
        char ci=u.charAt(m+1);
        if(ch=='p'&&ci=='i'){
            s=u.substring(0,m)+3.14+u.substring(m+2);
            return pie(s,m+1,s);
        }
        return pie(u,m+1,s);

    }
}
