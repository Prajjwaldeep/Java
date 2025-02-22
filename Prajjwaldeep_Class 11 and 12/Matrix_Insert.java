/**
 * A program to insert an element a the last position of the matrix and displacing all the elements column wise upwards,
 * finally eliminating the first element.
 */
import java.util.*;
class Matrix_Insert
{
    public static void main(String args[])//declaration of main method
    {
        int n,i,j,s=0,n1,s1;
        Scanner in=new Scanner(System.in);//declaration of scanner class
        System.out.println("Enter size of square matrix");
        n=in.nextInt();//accepting size of square matrix
        int arr[][]=new int[n][n];//initialising integer array of size n
        //Taking the matrix elements as Input
        System.out.println("Enter matrix elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the number to be inserted:");
        int num=in.nextInt();
        System.out.println("The matrix:");
        //Displaying Original matrix
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //Inserting matrix elements
        System.out.println("After Operation...");
        for(j=0;j<n;j++)
        {
            s=j+1;
            s1=j+1;
            if(j%2==0)
            {
                for(i=0;i<n;i++)
                {
                    if((i==n-1)&&(j==n-1))
                    {
                        arr[i][j]=num;
                    }
                    else if(i==n-1)
                    {
                        arr[i][j]=arr[i][s];
                        s=0;
                    }
                    else
                    arr[i][j]=arr[i+1][j];
                }
            }
                else
                {
                    for(i=n-1;i>=0;i--)
                    {
                        if((i==n-1)&&(j==n-1))
                        {
                             arr[i][j]=num;
                        }
                        else if(i==0)
                        {
                            arr[i][j]=arr[i][s1];
                            s1=0;
                        }
                        else
                        arr[i][j]=arr[i-1][j];
                    }
            }
        }   
        //Displaying final matrix after operation
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }//end of main method
}//end of class
   