import java.util.Scanner;
public class vowel_frequency
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str;
        int a,l,c=0,c1=0,c2=0,c3=0,c4=0;
        char ch;
        System.out.print("Enter the string : ");
        str=in.nextLine();
        str=str.toUpperCase();
        l=str.length();
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            if (ch=='A')
            c=c+1;
            if (ch=='E')
            c1=c1+1;
            if (ch=='I')
            c2=c2+1;
            if (ch=='O')
            c3=c3+1;
            if (ch=='U')
            c4=c4+1;
        }
        System.out.println("Number of A : "+c);
        System.out.println("Number of E : "+c1);
        System.out.println("Number of I : "+c2);
        System.out.println("Number of O : "+c3);
        System.out.println("Number of U : "+c4);
        if (c==0 && c1==0 && c2==0 && c3==0 && c4==0)
        System.out.println("The input is without any vowel");
        }
    }         