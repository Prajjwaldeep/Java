import java.util.*;
public class Goldbach_01
{
    public static boolean prime(int num)
    {
        int a,c=0;
        for (a=1; a<=num; a++)
        {
            if (num%a==0)
            {
                c++;
            }
        }
        if (c>2)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void prime_pairs(int x)
    {
        int a,b;
        System.out.println("PRIME PAIRS ARE : ");
        for (a=2; a<=x; a++)
        {
            for (b=a; b<=x; b++)
            {
                if ((prime(a)==true && prime(b)==true) && (a+b)==x)
                {
                    System.out.println(a+", "+b);
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n=in.nextInt();
        if (n<=9 || n>=50)
        {
            System.out.println("INVALID INPUT. NUMBER OUT OF RANGE.");
        }
        else if (n%2!=0)
        {
            System.out.println("INVALID INPUT. NUMBER IS ODD.");
        }
        else
        {
            prime_pairs(n);
        }
    }
}