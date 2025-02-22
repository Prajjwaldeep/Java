import java.util.*;
public class Vowel_consonants_2015
{
    public static int vowel(String str)
    {
        int a,l=str.length(),count=0;
        char ch;
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count++;
            }
        }
        return count;
    }
    public static int consonant(String str)
    {
        int l=str.length();
        int v=vowel(str);
        int c=l-v;
        return c;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("INPUT : ");
        String nstr="",str1=in.nextLine();
        if (str1.charAt(str1.length()-1)!='.' && str1.charAt(str1.length()-1)!='?')
        {
            System.out.println("Invalid Input.");
        }
        else
        {
            String nstr1="",str=str1+" ";
            int a,l=str.length();
            char ch,ch1;
            System.out.println("Word"+"\t"+"Vowels"+"\t"+"Consonants");
            for (a=0; a<l; a++)
            {
                ch=str.charAt(a);
                if (ch!=' ')
                {
                    nstr=nstr+ch;
                }
                else
                {
                    ch1=nstr.charAt(0);
                    String temp=String.valueOf(ch1);
                    String temp2=temp.toUpperCase();
                    if (nstr.charAt(nstr.length()-1)=='.' || nstr.charAt(nstr.length()-1)=='?')
                    {
                        nstr1=nstr1+temp2+nstr.substring(1,nstr.length()-1);
                    }
                    else
                    {
                        nstr1=nstr1+temp2+nstr.substring(1,nstr.length());
                    }
                    int v,c;
                    v=vowel(nstr1);
                    c=consonant(nstr1);
                    System.out.println(nstr1+"\t"+v+"\t"+c);
                    nstr="";
                    nstr1="";
                }
            }
        }
    }
}   