import java.util.*;
public class TestClass
{
    public static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static long numberOfWays(int N)
    {
        return fact(N)-N;
    }
    public static void main(String args[])
    {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.print("N : ");
        n=in.nextInt();
        System.out.println(numberOfWays(n));
    }
} 