import java.util.*;
public class remove_extra_space_and_word
{
    public static boolean check(String str)
    {
        int l=str.length();
        char ch=str.charAt(l-1);
        if (ch=='.' || ch=='?' || ch=='!')
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,nstr="";
        int a,l;
        char ch,ch1,ch2;
        boolean k;
        System.out.print("Enter the string : ");
        str=in.nextLine();
        k=check(str);
        if (k==false)
        {
            System.out.println("Sentence is not terminated by '.' , '?' or '!'.");
        }
        else if (k==true)
        {
            l=str.length();
            for (a=0; a<l; a++)
            {
                ch=str.charAt(a);
                if (ch!=' ')
                {
                    nstr=nstr+ch;
                }
                else
                {
                    ch1=str.charAt(a+1);
                    if (ch==ch1)
                    {
                        nstr=nstr+"";
                    }
                    else
                    {
                        nstr=nstr+ch;
                    }
                }
                System.out.print(nstr);
                nstr="";
            }
        }
    }
}