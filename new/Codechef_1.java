/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef_1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in=new Scanner(System.in);
        try
        {
            int i,t,n,a,sum1=0,sum2=0,r1,r2,r3,g1,g2,g3,b1,b2,b3;
            System.out.print("Test cases : ");
            t=in.nextInt();
            for(i=0; i<t; i++)
            {
                System.out.println("N :");
                n=in.nextInt();
                r1=in.nextInt();
                g1=in.nextInt();
                b1=in.nextInt();
                r2=in.nextInt();
                g2=in.nextInt();
                b2=in.nextInt();
                r3=in.nextInt();
                g3=in.nextInt();
                b3=in.nextInt();
                sum1=g1+b1+b2;
                sum2=r2+g3+r3;
                if(sum1>sum2)
                {
                    System.out.println(sum1);
                }
                else
                {
                    System.out.println(sum2);
                }
                sum1=0;
                sum2=0;
            }
        }
        catch(Exception e)
        {
            return;
        }
    }
}