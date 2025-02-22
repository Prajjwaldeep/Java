import java.util.*;
public class abc
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String n,nstr="";
        System.out.println("Enter : ");
        n=in.next();
        char one=n.charAt(0);
        int x=Character.getNumericValue(one);
        if(x>=5 && x<=8)
        {
            x=9-x;
        }
        nstr=nstr+x;
        int a,l;
        char ch;
        l=n.length();
        for(a=1; a<l; a++)
        {
            ch=n.charAt(a);
            if(ch>'4')
            {
                nstr=nstr+(9-(Character.getNumericValue(ch)));
            }
            else
            {
                nstr=nstr+Character.getNumericValue(ch);
            }
        }
        System.out.println(nstr);
    }
}