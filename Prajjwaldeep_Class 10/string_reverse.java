import java.util.Scanner;
public class string_reverse
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
        rev=rev+str1.charAt(a);
        System.out.println("Reversed string is : "+rev);
    }
}