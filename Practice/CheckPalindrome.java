

/**
 * Author:  ARUN BALAJI R
 * Date:    27 August 2021 (Friday)
 */


import java.util.*;
public class CheckPalindrome
{
    public static void main(String args[])
	{
	    Scanner in=new Scanner(System.in);
	    int a,l;
	    char ch;
	    String str1,str,nstr="";
	    System.out.print("Enter the string : ");
	    str=in.nextLine();
	    str1=str.toLowerCase();
	    l=str1.length();
	    for (a=(l-1); a>=0; a--)
	    {
	        ch=str1.charAt(a);
	        nstr=nstr+ch;
	    }
	    if(nstr.equals(str1))
	    {
	        System.out.println("It is a palindrome string.");
	    }
	    else
	    {
	        System.out.println("It is not a palindrome string.");
	    }
	}
}