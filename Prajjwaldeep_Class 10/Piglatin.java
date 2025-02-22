import java.util.*;
public class Piglatin
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str1,str,nstr1,nstr2,nstr;
        int a,l;
        char ch;
        System.out.print("Enter the string : ");
        str1=in.nextLine();
        str=str1.toLowerCase();
        l=str.length();
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            break;
        }
        nstr1=str.substring(a,l);
        nstr2=str.substring(0,a);
        nstr=nstr1+nstr2+"ay";
        System.out.println(nstr);
    }
}