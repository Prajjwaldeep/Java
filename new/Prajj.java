// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Prajj
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("Enter : ");
            Scanner in=new Scanner(System.in);
            int t,m,n,i,a,sum=0;
            t=in.nextInt();
            for(i=1; i<=t; i++)
            {
                n=in.nextInt();
                m=in.nextInt();
                int arr[]=new int[n];
                for(a=0; a<n; a++)
                {
                    arr[a]=in.nextInt();
                }
                for(a=0; a<n; a++)
                {
                    sum=sum+arr[a];
                }
                int k=sum/m;
                sum=sum-(m*k);
                System.out.println("Case #"+i+": "+sum);
                sum=0;
            }
        }
        catch(Exception e)
        {
            return;
        }
    }
}