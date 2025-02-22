/* A program to declare a square matrix A[ ] [ ] of order (M x M) 
 * where ‘M’ is the number of rows and the number of columns
 * such that M must be greater than 2 and less than 10.
 * Accepted the value of M as user input.
 * Displayed an appropriate message for an invalid input.
 * Allowed the user to input integers into this matrix.
 * Performed the following tasks:

(a)        Displayed the original matrix.

(b)        Checked if the given matrix is Symmetric or not.
           A square matrix is said to be Symmetric, if the element of the ith row and jth column is equal to the element of the jth row and ith column.

(c)        Found the sum of the elements of left diagonal and the sum of the elements of right diagonal of the matrix and display them. */
import java.util.*;
public class symmetric_matrix_and_diagonals
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); // Invoking Scanner class
        int l,c,r,sum1=0,sum2=0;
        boolean x=true;
        System.out.print("Enter the limit of the square matrix : "); // Displaying message to input the limit from the user
        l=in.nextInt(); // Accepting user input 
        int arr[][]=new int[l][l]; // Creating array structure with defined length
        System.out.println("Enter the elements of the matrix : "); // Displaying message to enter the limit of the matrix
        for (c=0; c<l; c++)
        {
            for (r=0; r<l; r++)
            { 
                // Taking the elements of array from user and storing it in the respective variable
                arr[c][r]=in.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX : ");
        // Displaying the original matrix
        for (c=0; c<l; c++)
        {
            for (r=0; r<l; r++)
            {
                System.out.print(arr[c][r]+" ");
            }
            System.out.println();
        }
        for (c=0; c<l; c++)
        {
            for (r=0; r<l; r++)
            {
                if (arr[c][r]!=arr[r][c]) // Checking for symmetric
                {
                    x=false; // If the elements of rows are not equal with the element of coloumns, 'false' will be assigned to x variable
                }
                break; // Applying break statement
            }
        }
        if (x==true) // When the value of x is true
        {
            // Display appropriate message
            System.out.println("THE GIVEN MATRIX IS SYMMETRIC");
        }
        else
        {
            // If the above condition is not satisfied, also display appropriate message
            System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC");
        }
        for (c=0; c<l; c++)
        {
            for (r=0; r<l; r++)
            {
                // Taking out the sum of the diagonals.
                if (c==r)
                {
                    sum1=sum1+arr[c][r]; //Sum of left diagonal 
                }
                else if ((c+r)==l)
                {
                    sum2=sum2+arr[c][r]; //Sum of right diagonal
                }
            }
        }
        // Displaying the following values
        System.out.println("The sum of left diagonal : "+sum1);
        System.out.println("The sum of right diagonal : "+sum2);
    }
}