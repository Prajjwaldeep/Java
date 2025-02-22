import java.util.*;
public class count_words_vowels
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,str1,str2;
        int a,l,c1=0,c2=0;
        char ch;
        System.out.print("Enter the string : ");
        str1=in.nextLine();
        str2=str1.toLowerCase();
        str=" "+str2;
        l=str.length();
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            if (ch==' ')/*as there is space before the firsr word,
            no of spaces becomes equal to the numbwer of words*/
            c1=c1+1;
            else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            c2=c2+1;
        }
        System.out.println("Number of vowels : "+c2);
        System.out.println("Number of words : "+c1);
    }
}