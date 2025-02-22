import java.util.*;
public class word_last_3
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,str1,nstr,nstr1;
        int l,l1;
        System.out.println("Enter a word : ");
        str=in.next();
        System.out.println("Enter another word : ");
        str1=in.next();
        l=str.length();
        l1=str1.length();
        nstr=str.substring((l-3),l);
        nstr1=str1.substring((l1-3),l1);
        if (nstr.equals(nstr1))
        System.out.println("The output is : "+nstr);
        else
        System.out.println("They are not same");
    }
}
        