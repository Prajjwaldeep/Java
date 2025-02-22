import java.util.*;
public class Circular_Prime_2016
{
    public static boolean isPrime(int x)
    {
        int r,c=0;
        for (r=1; r<=x; r++)
        {
            if (x%r==0)
            {
                c++;
            }
        }
        if (c<=2)
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
        int n,a,l,count=0;
        int temp;
        char ch;
        System.out.print("N= ");
        n=in.nextInt();
        String str="",nstr;
        str=str+n;
        l=str.length();
        System.out.println("\n"+str);
        for (a=0; a<(l-1); a++)
        {
            ch=str.charAt(0);
            nstr=str.substring(1,l)+ch;
            temp=Integer.valueOf(nstr);
            if (nstr!=str && isPrime(temp)==true)
            {
                System.out.println(nstr);
                count++;
            }
            else if (nstr!=str && isPrime(temp)==false)
            {
                System.out.println(nstr);
                count=0;
            }
            str=nstr;
        }
        if (count>0)
        {
            System.out.println("\n"+n+" IS A CIRCULAR PRIME");
        }
        else
        {
            System.out.println("\n"+n+" IS NOT A CIRCULAR PRIME");
        }
    }
}