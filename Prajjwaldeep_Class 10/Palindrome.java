import java.util.Scanner;
public class Palindrome
{
    public static void main(String arsg[])
    {
        Scanner in=new Scanner(System.in);
        String str,str1,rev="";
        int l,a;
        System.out.println("Enter the word : ");
        str=in.next();
        str1=str.toLowerCase();
        l=str1.length();
        for (a=l-1; a>=0; a--)
        {
            rev=rev+str1.charAt(a);
        }
        char ch;
        String nstr="";
        if (str1.equals(rev))
        System.out.println("String is a palindrome");
        else
        System.out.println("String is a not palindrome");
    }
}