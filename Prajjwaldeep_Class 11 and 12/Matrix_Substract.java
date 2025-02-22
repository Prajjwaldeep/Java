/**
 * A sample program to substract two square matrices of any order
 */
import java.util.*;
class Matrix_Substract
{
    public static void main(String args[])//declaration of main method
    {
        int row,col,i,j;
        Scanner in=new Scanner(System.in);//declaration of scanner class
        //Accepting row size
        System.out.println("Enter size of row size");
        row=in.nextInt();
        //Accepting column size
        System.out.println("Enter size of col size");
        col=in.nextInt();
        int a[][]=new int[row][col];
        int b[][]=new int[row][col];
        int c[][]=new int[row][col];
        //Taking the matrix elements as Input in first matrix
        System.out.println("Enter"+" "+(row*col)+" "+"elements of first matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        //Taking the matrix elements as Input in second matrix
        System.out.println("Enter"+" "+(row*col)+" "+"elements of second matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
        //Displaying first matrix
        System.out.println("First matrix..");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //Displaying second matrix
        System.out.println("Second matrix..");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        //Substracting matrix elements
        System.out.println("After substraction..");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                c[i][j]=a[i][j]-b[i][j];
            }
        }
        //Displaying final matrix after substraction
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }//end of main method 
}//end of class
        
        
        