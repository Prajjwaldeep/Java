import java.util.*;
public class Caesar_Cipher_2017
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str;
        System.out.print("INPUT : ");
        str=in.nextLine();
        int a,l=str.length();
        if (l<=3 || l>=100)
        {
            System.out.println("INVALID LENGTH");
        }
        else
        {
            char ch;
            String nstr="";
            for (a=0; a<l; a++)
            {
                char ch1;
                ch=str.charAt(a);
                if (ch!=' ')
                {
                    if ((ch>='A' && ch<='M') || (ch>='a' && ch<='m'))
                    {
                        int temp=(int)ch;
                        temp=temp+13;
                        ch1=(char)temp;
                        nstr=nstr+ch1;
                    }
                    else if ((ch>='N' && ch<='Z') || (ch>='n' && ch<='z'))
                    {
                        int temp=(int)ch;
                        temp=temp-13;
                        ch1=(char)temp;
                        nstr=nstr+ch1;
                    }
                    else
                    {
                        ch1=ch;
                        nstr=nstr+ch1;
                    }
                }
                else
                {
                    ch1=ch;
                    nstr=nstr+ch1;
                }
            }
            System.out.println("The cipher text is : "+"\n"+nstr);
        }
    }
}