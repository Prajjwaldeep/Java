import java.util.*;
public class palindrome_ISC_2019
{
    public static boolean check_palindrome(String str)
    {
        String str1,rev="";
        int l,a;
        str1=str.toLowerCase();
        l=str1.length();
        for (a=(l-1); a>=0; a--)
        {
            rev=rev+str1.charAt(a);
        }
        if (str1.equals(rev))
        return true;
        else
        return false;
    }
    public static String palindrome_make(String str)
    {
        String str1,rev="",xstr,nstr,character="";;
        int l,l1,a;
        char ch1,ch2;
        l=str.length();
        ch1=str.charAt(l-1);
        for (a=(l-1); a>=0; a--)
        {
            rev=rev+str.charAt(a);
        }
        xstr=rev.substring(1,l);
        l1=xstr.length();
        ch2=xstr.charAt(0);
        character=character+ch2;
        if (ch1!=ch2)
        {
            nstr=str+xstr;
        }
        else
        {
            xstr=xstr.replaceAll(character,"");
            nstr=str+xstr;
        }
        return nstr;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str1,str,strx,strd=" ",nstr=" ",pstr=" ",n,qwerty="";
        int a,l1,l,i;
        char ch,y,z;
        boolean b;
        System.out.print("Enter the string : ");
        str1=in.nextLine();
        strx=str1.toUpperCase();
        l1=strx.length();
        if (strx.charAt(l1-1)!='.' && strx.charAt(l1-1)!='!' && strx.charAt(l1-1)!='?')
        {
            System.out.println("Input isn't terminated by a '.', '!' or a '?'");
        }
        else
        {
            strd=strx.substring(0,(l1-1));
            str=strd+" ";
            l=str.length();
            for (a=0; a<l; a++)
            {
                ch=str.charAt(a);
                if (ch!=' ')
                {
                    nstr=nstr+ch;
                    if(check_palindrome(nstr)!=true)
                    {
                        pstr=palindrome_make(nstr);
                    }
                    else
                    {
                        pstr=nstr;
                    }
                }
                else
                {
                    System.out.print(pstr);
                    nstr=" ";
                }
            }
            a++;
        }
    }
}