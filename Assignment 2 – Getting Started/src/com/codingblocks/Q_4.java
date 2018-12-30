package com.codingblocks;
import java.util.Scanner;
public class Q_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=2; i<=n; i++){
            int c = 2;
            while(c*c < i){
                if(i%c == 0 ){
                    break;
                }
                c++;
            }
            if(c*c > i){
                System.out.println(i);
            }
        }
    }
}
