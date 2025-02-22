import java.util.*;
public class palin_maker
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str;
        System.out.print("Enter : ");
        str=in.next();
        String str1,rev="",xstr,nstr;
        int l,a;
        str1=str.toUpperCase();
        l=str1.length();
        for (a=(l-1); a>=0; a--)
        {
            rev=rev+str1.charAt(a);
        }
        xstr=rev.substring(1,l);
        nstr=str1+xstr;
        System.out.println(nstr);
    }
}