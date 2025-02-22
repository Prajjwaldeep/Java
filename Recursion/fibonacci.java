import java.util.*;
public class fibonacci
{
    public static int fibo(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        else
        {
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the nth fibonacci : ");
        n=in.nextInt();
        int ans=fibo(n);
        System.out.println(n+"th number from fibonacci series : "+ans);
    }
}