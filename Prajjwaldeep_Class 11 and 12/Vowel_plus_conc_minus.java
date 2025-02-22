import java.util.*;
public class Vowel_plus_conc_minus
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str1,str,nstr="";
        int l,a,x;
        char ch;
        System.out.print("Enter the string : ");
        str1=in.nextLine();
        str=str1.toUpperCase();
        l=str.length();
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            if (ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                x=((int)(ch))-2;
                ch=(char)(x);
            }
            else if(ch=='A')
            {
                x=((int)(ch))+24;
                ch=(char)(x);
            }
            else if(ch=='Y' || ch=='Z')
            {
                x=((int)(ch))-24;
                ch=(char)(x);
            }
            else
            {
                x=((int)(ch))+2;
                ch=(char)(x);
            }
            nstr=nstr+ch;
        }
        System.out.println(nstr);
    }
}