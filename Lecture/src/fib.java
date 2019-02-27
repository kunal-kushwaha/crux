public class fib
{
    public static void main(String[] args) {
        int n=5;
        int res=fibb(5);
        System.out.println(res);
    }
    static  int fibb(int n)
    {
        if(n < 2)
            return n;

        else
            return  fibb(n-1)+fibb(n-2);
    }
}
