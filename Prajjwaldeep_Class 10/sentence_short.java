import java.util.*;
public class sentence_short
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str1,strx,str2,str3,str,nstr1="",nstr="";
        int a,l,l1,x;
        char ch,ch1;
        System.out.print("Enter the string : ");
        str1=in.nextLine();
        x=str1.length();
        if (str1.charAt(x-1)=='.' || str1.charAt(x-1)==',' || str1.charAt(x-1)=='!')
        {
            strx=str1.substring(0,(x-1));
        }
        else
        {
            strx=str1;
        }
        str2=strx.toUpperCase();
        str3=str2.replaceAll(" ",".");
        str="."+str3;
        l=str.length();
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            if (ch=='.')
            {
                ch1=str.charAt(a+1);
                nstr1=nstr1+ch+ch1;
            }
        }
        l1=nstr1.length();
        nstr=nstr1.substring(1,l1);
        System.out.println("New string : "+nstr);
    }
}