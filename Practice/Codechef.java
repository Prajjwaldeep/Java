/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int[] reverse(int[] array)
    {
  
        // Length of the array
        int n = array.length;
  
        // Swaping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {
  
            // Storing the first half elements temporarily
            int temp = array[i];
  
            // Assigning the first half to the last half
            array[i] = array[n - i - 1];
  
            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
        return array;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t,i,n,x,a,b,sum=0;
		boolean check=false;
		System.out.println("Test cases :");
		t=in.nextInt();
		for(i=0; i<t; i++)
		{
		    System.out.println("N :");
		    n=in.nextInt();
		    System.out.println("X :");
		    x=in.nextInt();
		    int arr[]=new int[n];
		    System.out.println("Array elements :");
		    for(a=0; a<n; a++)
		    {
		        arr[a]=in.nextInt();
		    }
		    Arrays.sort(arr);
		    arr=reverse(arr);
		    for(a=0; a<n; a++)
		    {
		        sum=sum+arr[a];
		        if(sum>=x)
		        {
		            check=true;
		            break;
		        }
		    }
		    System.out.println(sum);
		    
		    if(check==true)
		    {
		        System.out.println("COUNT : "+(a+1));
		    }
		    else
		    {
		        System.out.println("-1");
		    }
		    sum=0;
		    check=false;
		}
	}
}
