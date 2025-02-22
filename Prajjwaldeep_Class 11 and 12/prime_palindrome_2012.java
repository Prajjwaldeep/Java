import java.util.*;
public class prime_palindrome_2012
{
    public static boolean Prime(int x)
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
    public static boolean paindrome(int x)
    {
        String str="",nstr="";
        str=str+x;
        int a,l=str.length();
        for(a=(l-1); a>=0; a--)
        {
            char ch=str.charAt(a);
            nstr=nstr+ch;
        }
        if (nstr.equals(str))
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
        int m,n,a,c=0;
        System.out.print("m=");
        m=in.nextInt();
        System.out.print("n=");
        n=in.nextInt();
        if (m>=3000 || n>=3000)
        {
            System.out.println("OUT OF RANGE");
        }
        else
        {
            String str="",nstr;
            System.out.println("THE PALINDROME INTEGERS ARE : ");
            for (a=m; a<=n; a++)
            {
                if (Prime(a)==true && paindrome(a)==true)
                {
                    str=str+a+", ";
                    c++;
                }
            }
            nstr=str.substring(0,((str.length())-2));
            System.out.println(nstr);
            System.out.println("FREQUENCY OF PRIME PALINDROME INTEGERS : "+c);
        }
    }
}