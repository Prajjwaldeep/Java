/**
 * A sample program to multiply the elements of two matrices and 
 * finally display the result.
 */
import java.util.*;
class Matrix_Multiplication
{
    public static void main(String args[])//declaration of main method
    {
        int row1,col1,i,j,row2,col2,k,sum=0;
        Scanner in=new Scanner(System.in);//declaration of scanner class
        //Accepting row size of first matrix
        System.out.println("Enter row size(1st matrix)");
        row1=in.nextInt();
        //Accepting column size of first matrix
        System.out.println("Enter col size(1st matrix)");
        col1=in.nextInt();
        int a[][]=new int[row1][col1];
        //Accepting row size of second matrix
        System.out.println("Enter row size(2nd matrix)");
        row2=in.nextInt();
        //Accepting column size of second matrix
        System.out.println("Enter col size(2nd matrix)");
        col2=in.nextInt();
        int b[][]=new int[row2][col2];
        int c[][]=new int[row1][col2];
        //Taking the matrix elements as Input in first matrix
        System.out.println("Enter"+" "+(row1*col1)+" "+"elements of first matrix");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        //Taking the matrix elements as Input in second matrix
        System.out.println("Enter"+" "+(row2*col2)+" "+"elements of second matrix");
        for(i=0;i<row2;i++)
        {
            for(j=0;j<col2;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
        //Displaying first matrix
        System.out.println("First matrix..");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //Diplaying second matrix
        System.out.println("Second matrix..");
        for(i=0;i<row2;i++)
        {
            for(j=0;j<col2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        //Multiplying matrix elements of the two matrices
        if(row1!=col2)
         System.out.println("Invalid for multiplication");
        else
        {
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    for(k=0;k<row2;k++)
                    {
                        sum=sum+(a[i][k]*b[k][j]);
                    }
                    c[i][j]=sum;
                    sum=0;
                }
            }
            //Displaying matrix after multiplication
            System.out.println("After multiplication:");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }//end of main method
}//end of class
     


        