import java.util.*;
public class Word_Potential_01
{
    public static boolean terminate(char ch)
    {
        if (ch=='.' || ch=='!' || ch=='?')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void potential(String str)
    {
        int l=str.length(),a,c=0;
        char ch;
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            c=c+((int)ch);
        }
        int min=0;
        String ns="";
        if (c>0)
        {
            ns=ns+str;
        }
        System.out.println(str+" = "+c);
        /*int arr[]=new int[100];
        for (a=)*/    
    
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str1,str2,str3,str,nstr="";
        int l,l1,a;
        char ch,last;
        boolean x;
        System.out.print("Enter the string : ");
        str1=in.nextLine();
        l1=str1.length();
        str2=str1.substring(0,(l1-1));
        str3=str2.toUpperCase();
        str=str3+" ";
        l=str.length();
        last=str1.charAt(l1-1);
        if (terminate(last)!=true)
        {
            System.out.print("Sentence isn't terminated by '.' , '!' or '?'");
        }
        else
        {
            for (a=0; a<l; a++)
            {
                ch=str.charAt(a);
                if (ch!=' ')
                {
                    nstr=nstr+ch;
                }
                else
                {
                    potential(nstr);
                    nstr="";
                }
            }
        }
    }
}