import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n ; i++) {

            int a = i;

            if(a <= n/2 + 1){
                for (int j = 0; j <= n - 2*i; j++) {
                    System.out.print("  ");
                }
                while(a > 0){
                    System.out.print(a + " ");
                    a = a-1;
                }
                for (int j = 0; j < 2*(i-1) - 1; j++) {
                    System.out.print("  ");
                }
                while(a < i && i!=1){
                    System.out.print(a+1 + " ");
                    a = a + 1;
                }
            }else{
                a = i - 2*(i - n/2 -1);
                int k = a;

                for (int j = 0; j < 2*(n/2 + 1 - k); j++) {
                    System.out.print("  ");
                }
                while(a > 0){
                    System.out.print(a + " ");
                    a = a-1;
                }
                for (int j = 0; j < 2*(k-1) - 1; j++) {
                    System.out.print("  ");
                }
                while(a < k && k!=1){
                    System.out.print(a+1 + " ");
                    a = a + 1;
                }
            }
            System.out.println();
        }
    }
}
