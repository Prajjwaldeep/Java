import java.util.*;
public class Composite_magic_2014
{
    public static boolean composite(int x)
    {
        int a,count=0;
        for (a=1; a<=x; a++)
        {
            if (x%a==0)
            {
                count++;
            }
        }
        if (count>2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int sum(int x)
    {
        String str="";
        str=str+x;
        int l=str.length(),a,temp,count=0;
        char ch;
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            temp=Integer.valueOf(String.valueOf((ch)));
            count=count+temp;
            count=magic(count);
        }
        return count;
    }
    public static int magic(int x)
    {
        while (x>9)
        {
            x=sum(x);
        }
        return x;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m,n,i,z=0;
        System.out.print("m=");
        m=in.nextInt();
        System.out.print("n=");
        n=in.nextInt();
        if (m>=n)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
            System.out.println("THE COMPOSITE MAGIC INTEGERS ARE : ");
            String str="",str1;
            for (i=m; i<=n; i++)
            {
                if (composite(i)==true && magic(i)==1)
                {
                    str=str+", "+i;
                }
            }
            str1=str.substring(2,(str.length()));
            System.out.println(str1);
        }
    }
}