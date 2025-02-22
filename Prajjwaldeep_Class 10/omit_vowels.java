import java.util.Scanner;
public class omit_vowels
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,str1;
        System.out.print("Input the string : ");
        str=in.next();
        str1=str.replaceAll("[aeiouAEIOU]","");
        System.out.println("New string is : "+str1);
    }
}