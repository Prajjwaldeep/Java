import java.util.Scanner;
public class no_of_vowel_consonent
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,str1;
        int a,l,v=0,c=0;
        char ch;
        System.out.println("Enter the string : ");
        str=in.nextLine();
        str1=str.toLowerCase();
        l=str1.length();
        for (a=0; a<l; a++)
        {
            ch=str1.charAt(a);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            v=v+1;
            else
            c=c+1;
        }
        System.out.println("No of vowel : "+v);
        System.out.println("No of consonent : "+c);
    }
}