import java.util.*;
public class Goldbach_2018
{
    public static boolean isPrime(int x)
    {
        int a,c=0;
        for(a=1; a<=x; a++)
        {
            if (x%a==0)
            {
                c++;
            }
        }
        if (c==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,a,b;
        System.out.print("N= ");
        n=in.nextInt();
        String str="INVALID INPUT.";
        if (n<=9 || n>=50)
        {
            System.out.println(str+" NUMBER OUT OF RANGE.");
        }
        else if (n%2!=0)
        {
            System.out.println(str+" NUMBER IS ODD.");
        }
        else
        {
            System.out.print("PRIME PAIRS ARE : ");
            for (a=2; a<=n; a++)
            {
                for (b=a; b<=n; b++)
                {
                    if ((isPrime(a)==true && (isPrime(b)==true)))
                    {
                        if (a%2!=0 && b%2!=0)
                        {
                            if ((a+b)==n)
                            {
                                System.out.println(a+", "+b);
                            }
                        }
                    }
                }
            }
        }
    }
}