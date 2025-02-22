import java.util.Scanner;
public class count_vowels
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str;
        int a,l,count=0;
        char ch;
        System.out.print("Enter the string : ");
        str=in.nextLine();
        str=str.toUpperCase();
        l=str.length();
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            count=count+1;
        }
        System.out.println("Number of vowels in the string : "+count);
    }
}