/**
 * A sample program to add two square matrices of any order
 */
import java.util.*;
class Matrix_Addition
{
    public static void main(String args[])//declaration of main method
    {
        int row1,col1,row2=0,col2=0,i,j;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter row size");//Accepting row size of matrix
        row1=in.nextInt();
        System.out.println("Enter column size");//Accepting column size of matrix
        col1=in.nextInt();
        int a[][]=new int[row1][col1];
        System.out.println("Enter"+" "+(row1*col1)+" "+"elements of first matrix");//Taking the elements as Input in the first matrix
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter row size");//Accepting row size of matrix
        row2=in.nextInt();
        System.out.println("Enter column size");//Accepting column size of matrix
        col2=in.nextInt();
        System.out.println("Enter"+" "+(row2*col2)+" "+"elements of second matrix");//Taking the elements as Input in the second matrix
        int b[][]=new int[row2][col2];
        for(i=0;i<row2;i++)
        {
            for(j=0;j<col2;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
        int c[][]=new int[row1][col1];
        System.out.println("First matrix..");//Displaying first matrix
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second matrix..");//Displaying second matrix
        for(i=0;i<row2;i++)
        {
            for(j=0;j<col2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        if(row1!=row2&&col1!=col2)
        {
            System.out.println("Addition is not possible..");
        }
        else
        {
            System.out.println("After addition..");//Adding the two matrices
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
            for(i=0;i<row1;i++)//Displaying the final matrix after addition
            {
                for(j=0;j<col1;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }//end of main method
}//end of class
        
        