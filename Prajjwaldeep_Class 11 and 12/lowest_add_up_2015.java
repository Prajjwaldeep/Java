import java.util.*;
public class lowest_add_up_2015
{
    public static int sum_of_digits(int x)
    {
        String str="";
        str=str+x;
        int i,l=str.length(),count=0,val;
        char ch;
        String temp;
        for (i=0; i<l; i++)
        {
            ch=str.charAt(i);
            temp=String.valueOf(ch);
            val=Integer.valueOf(temp);
            count=count+val;
        }
        return count;
    }
    public static int number_of_digits(int x)
    {
        String str="";
        str=str+x;
        int i,l=str.length(),val,count=0;
        char ch;
        String temp;
        for (i=0; i<l; i++)
        {
            count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int M,N,v;
        System.out.print("M=");
        M=in.nextInt();
        System.out.print("N=");
        N=in.nextInt();
        if (M<100 || M>10000 || N>=100)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
            System.out.print("The required number = ");
            int i,n;
            for (i=M; i<=10000; i++)
            {
                n=sum_of_digits(i);
                if (n==N)
                {
                    v=number_of_digits(i);
                    System.out.println(i);
                    System.out.println("Total number of digits = "+v);
                    break;
                }
            }
        }
    }
}