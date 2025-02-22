import java.util.*;
public class multiple_alphabet_remove
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,str1,nstr="";
        System.out.print("Enter the string : ");
        str1=in.next();
        str=str1+" ";
        int l=str.length(),a;
        char ch,ch1;
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            if (ch>='A' && ch<='Z' || ch>'a' && ch<'z')
            {
                ch1=str.charAt(a+1);
                if (ch==ch1)
                {
                    nstr="";
                }
                else
                {
                    nstr=nstr+ch;
                    System.out.print(nstr);
                }
            }
            nstr="";
        }
    }
}