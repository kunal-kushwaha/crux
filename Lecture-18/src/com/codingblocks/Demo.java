package com.codingblocks;

public class Demo {
}

//class GFG {
//    public static void main(String[] args)
//    {
//        int x = 10;
//        if (++x < 10 && (x / 0 > 10)) {
//            System.out.println("Ankit");
//        } else {
//            System.out.println("GEEKS");
//        }
//    }
//}

//class GFG
//{
//    public static void main(String[] args)
//    {
//        final int a = 10, b = 20;
//        while (a > b) {
//            System.out.println("Hello");
//        }
//        System.out.println("GEEKS");
//    }
//}

//class GFG
//{
//    public static void main(String args[])
//    {
//        int var1 = 5;
//        int var2 = 6;
//
//        if ((var2 = 1) == var1)
//            System.out.print(var2);
//        else
//            System.out.print(++var2);
//
//    }
//
//}

class GFG
{
    public static void main(String args[])
    {
        int x = 2;
        int y = 0;
        for ( ; y < 10; ++y)
        {
            if (y % x == 0)
                continue;
            else if (y == 8)
                break;
            else
                System.out.print(y + " ");
        }

    }

}