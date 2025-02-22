/**
 * A sample program to display the lucky numbers upto a certain limit
 */
import java.util.*;
class Lucky_num
{
    public static void main(String args[])//declaration of main method
    {
        Scanner in=new Scanner(System.in);//declaration of scanner class
        System.out.println("Enter the number of elements");
        int n=in.nextInt();        //Accepting the limit of displaying the lucky numbers
        int a[]=new int[n];        //initialising integer array of sizen
        int c=n;
        //Accepting array elements
        for(int i=0;i<n;i++)
        {
            a[i]=i+1;
        }
        //Displaying array elements
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        int del=1;
        //Displaying Lucky numbers
        System.out.println("Lucky numbers:");
        while(del<n)
        {
            for(int i=del;i<n;i+=del)
            {
                for(int j=i;j<n-1;j++)
                {
                    a[j]=a[j+1];
                }
                n--;
            }
            del++;
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        //displaying Lucky numbers less than n
        System.out.println("Lucky nums less than"+" "+c+":");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }//end of main method
}//end of class
            
        
        