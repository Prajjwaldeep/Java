/**
 * A sample program to create a magic square having the same value of sum of all rows and columns and diagonals 
 */
import java.util.*;
public class Magic_Square
{
    public static void main(String args[])//declaration of main method
    {
        Scanner in=new Scanner(System.in);//declaration of scanner class
        System.out.println("Enter matrix size");
        int n=in.nextInt();//accepting matrix size
        int magic[][]=new int[n][n];//initialising square matrix of size n
        int i,j,k,t,sum=0;
        //accepting matrix elements
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
               magic[i][j]=0;
            }
        }
        if(n%2!=0)//if n is odd
        {
            i=0;
            j=n/2;
            k=1;
            while(k<=n*n)
            { 
                magic[i][j]=k++;
                 i--;
                    j++;
                    if((i<0)&&(j>n-1))
                    {
                        i=i+2;
                        j--;
                    }
                    if(i<0)
                    i=n-1;
                    if(j>n-1)
                    j=0;
                    if(magic[i][j]>0)
                    {
                        i=i+2;
                        j--;
                    }
                }
            }
            else//if n is even
            {
                k=1;
                for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        magic[i][j]=k++;
                    }
                }
                j=n-1;
                for(i=0;i<n/2;i++)
                {
                    //for swapping corner elements of primary diagonal
                    t=magic[i][j];
                    magic[i][j]=magic[j][i];
                    magic[j][i]=t;
                    //for swapping corner elements of secondary diagonal
                    t=magic[i][j];
                    magic[i][j]=magic[j][i];
                    magic[j][i]=t;
                    j--;
                }
            }
            //printing magic square
            for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
               System.out.print(magic[i][j]+" ");
            }
            System.out.println();
        }
        //calculating the sum of all four diagonal elements
        sum=magic[0][0]+magic[0][n-1]+magic[n-1][0]+magic[n-1][n-1];
        System.out.println("Sum of all four corner elements:"+sum);
    }//end of main method 
}//end of class
                    