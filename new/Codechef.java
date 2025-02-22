/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in=new Scanner(System.in);
		// your code goes here
		int t,a,k,c=0;
		System.out.println("Test cases : ");
		t=in.nextInt();
		for(a=0; a<t; a++)
		{
		    System.out.println("Enter "+(a+1)+" value of K :");
		    k=in.nextInt();
		    while(k%2==0)
		    {
		        c++;
		        k=k/2;
		    }
		    System.out.println(c);
		    c=0;
		}
	}
}
