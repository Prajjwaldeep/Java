/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		try
		{
		    int t;
		    System.out.println("Enter the number of test cases : ");
		    t=in.nextInt();
		    int a,te=0;
		    String str,str1="",str2="";
		    for(a=0; a<t; a++)
		    {
		        str=in.next();
		        str1=str.replaceAll("10","");
		        str2=str.replaceAll("11","");
		        if(str.equals(str1) && str.equals(str2))
		        {
		            System.out.println("No");
		        }
		        else
		        {
		            System.out.println("Yes");
		        }
		        //System.out.println(str1+"\t"+str2);
		    }
		  }
		  catch(Exception e)
		  {
		      return;
		  }
    }
}
