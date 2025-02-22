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
		try {
		    int t,i,x,c=0,n=0,d=0,l,p,carlsen,chef;
		    System.out.println("Test cases : ");
		    t=in.nextInt();
		    char ch;
		    String str;
		    System.out.println(t+" x and "+t+" strings : ");
		    for(i=0; i<t; i++)
		    {
		        x=in.nextInt();
		        str=in.next();
		        l=str.length();
		        for(p=0; p<l; p++)
		        {
		            ch=str.charAt(p);
		            if(ch=='C' || ch=='c')
		            {
		                c++;
		            }
		            else if(ch=='N' || ch=='n')
		            {
		                n++;
		            }
		            else if(ch=='d' || ch=='D')
		            {
		                d++;
		            }
		          }
		          carlsen=(2*c)+d;
		          chef=(2*n)+d;
		          int t1=0;
		          if(carlsen>chef)
		          {
		              t1=60*x;
		          }
		          else if(carlsen==chef)
		          {
		              t1=55*x;
		          }
		          else
		          {
		              t1=40*x;
		          }
		          System.out.println(t1);
		          //System.out.println(c+" "+n+" "+d);
		          c=0;
		          n=0;
		          d=0;
		          str="";
		        }
		} catch(Exception e) {
		    return;
		} 
	    }
    }
