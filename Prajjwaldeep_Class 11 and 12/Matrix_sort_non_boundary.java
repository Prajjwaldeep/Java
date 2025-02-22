/* A program to declare a square matrix a[][] of order (M × M) where ‘M’ must be greater than 3 and less than 10. Allow the user to input positive integers into this matrix. The program perform the following tasks on the matrix:
 * a) Sort the non-boundary elements in ascending order using any standard sorting technique and rearrange them in the matrix.
 * b) Calculate the sum of both the diagonals.
 * c) Display the original matrix, rearranged matrix and only the diagonal elements of the rearranged matrix with their sum. */
import java.util.*;
class Matrix_sort_non_boundary
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); // Invoking scanner class
        int m,i,j;
        System.out.print("Enter the size of the matrix : "); // Asking input from the user
        m=in.nextInt(); // Accepting input
        if(m<4 || m>9)
        { // When matrix is less than 4 or greater than 9
            System.out.println("THE MATRIX SIZE IS OUT OF RANGE.");
            // Display message matrix size out of range
            return;
        }
        int a[][]=new int[m][m];
        System.out.println("Enter the element(s) of the matrix :");
        // Asking for elements from user as input
        for(i=0; i<m; i++)
        {
            for(j=0; j<m; j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");
        // Displaying the element(s) entered by the user in a matrix format
        for(i=0; i<m; i++)
        {
            for(j=0; j<m; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        int b[]=new int[(m-2)*(m-2)];
        int k=0;
        // Seection for non-boundary elements
        for(i=1; i < m-1; i++)
        {
            for(j=1; j<(m-1); j++)
            {
                b[k++]=a[i][j];
            }
        }
        // Sorting the elements
        for(i=0; i<b.length; i++)
        {
            for(j=0; j<(b.length-1-i); j++)
            {
                if(b[j] > b[j + 1])
                {
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        k=0;
        for(i=1; i<(m-1); i++)
        {
            for(j=1; j<(m-1); j++)
            {
                a[i][j]=b[k++];
            }
        }
        System.out.println("REARRANGED MATRIX");
        // Displaying the elements after sort
        for(i=0; i<m; i++)
        {
            for(j=0; j<m; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        int sum=0;
        System.out.println("DIAGONAL ELEMENTS");
        // Printing the diagonals
        for(i=0; i<m; i++)
        {
            for(j=0; j<m; j++)
            {
                if(i==j || i+j== m-1)
                {
                    System.out.print(a[i][j] + "\t");
                    sum += a[i][j];
                }
                else
                System.out.print("\t");
            }
            System.out.println();
        }
        // Printing the sum of the diagonals
        System.out.println("SUM OF THE DIAGONAL ELEMENTS = " + sum);
    }
}