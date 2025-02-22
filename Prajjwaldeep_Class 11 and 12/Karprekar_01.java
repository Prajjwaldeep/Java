import java.util.*;
public class Karprekar_01
{
    public static int number_of_digits(int x)
    {
        int y=1;
        while (x!=0)
        {
            y=y*10;
            x=x/10;
        }
        return y;
    }
    public static void Karprekar(int x)
    {
        int r,s,s1,s2,sum=0;
        r=number_of_digits(x);
        s=(x*x);
        s1=s%r;
        s2=s/r;
        sum=s1+s2;
        if (sum==x)
        {
            System.out.println(x);
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int p,q;
        System.out.println("Enter the range (It is to be assumed that p<5000 and q<5000) : ");
        p=in.nextInt();
        q=in.nextInt();
        if (p<5000 && q<5000)
        {
            int a;
            for (a=p; a<=q; a++)
            {
                Karprekar(a);
            }
        }
        else
        {
            System.out.println("Number out of range");
        }
    }
}