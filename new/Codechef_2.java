/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef_2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try
        {
            // your code goes here
            Scanner in=new Scanner(System.in);
            System.out.println("Test cases : ");
            int i,t,k,temp;
            double res;
            t=in.nextInt();
            for(i=0; i<t; i++)
            {
                k=in.nextInt();
                res=52%k;
                temp=(int)res;
                if((double)temp!=res)
                {
                    temp++;
                }
                System.out.println(temp);
            }
        }
        catch(Exception e)
        {
            return;
        }
    }
}
