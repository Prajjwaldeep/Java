import java.util.*;
public class Kaprekar_2010
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int p,q,n,s,l,l1,p1,p2,count=0;
        String w="";
        String x,d;
        System.out.print("p= ");
        p=in.nextInt();
        System.out.print("q= ");
        q=in.nextInt();
        if (p>=q)
        {
            System.out.println("Out of range");
        }
        else
        {
            System.out.print("THE KAPREKAR NUMBERS ARE :- ");
            for (n=p; n<=q; n++)
            {
                s=n*n;
                String str="",str1="",first,second;
                str=str+n;
                str1=str1+s;
                l=str.length();
                l1=str1.length();
                int t;
                t=l1-l;
                if (n==1 || n==2 || n==3)
                {
                    int temp=n*n;
                    String temp1="";
                    temp1=temp1+temp;
                    first=temp1;
                    second="0";
                }
                else
                {
                    first=str1.substring(0,t);
                    second=str1.substring(t,l1);
                }
                p1=Integer.valueOf(first);
                p2=Integer.valueOf(second);
                if ((p1+p2)==n)
                {
                    w=w+n+", ";
                    count++;
                }
            }
        }
        d=w.substring(0,(w.length()-2));
        System.out.print(d);
        System.out.println("\n"+"FREQUENCY OF KAPREKAR NUMBER IS : "+count);
    }
}