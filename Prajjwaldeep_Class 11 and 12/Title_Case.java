import java.util.*;
public class Title_Case
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str1,str,nstr="";
        int l,a;
        char ch,ch1;
        System.out.print("Enter the string : ");
        str1=in.nextLine();
        str=" "+str1;
        l=str.length();
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            if (ch==' ')
            {
                ch=str.charAt(a+1);
                ch1=Character.toUpperCase(ch);
                nstr=nstr+" "+ch1;
                a++;
            }
            else
            {
                nstr=nstr+ch;
            }
        }
        System.out.println("Required output :"+nstr);
    }
}