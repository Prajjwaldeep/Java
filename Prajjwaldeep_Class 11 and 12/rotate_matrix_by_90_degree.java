/* A program to rotate the matrix in an array by 90 degree
 * The program consists of a square matrix
 */
import java.util.*;
public class rotate_matrix_by_90_degree
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); //Set scanner class to read input
        int n,c,r,sum=0;
        System.out.println("Enter the limit of the square matrix : ");// Display message to input the limits of rows and column
        // Read the limit of square matrix
        n=in.nextInt();
        int arr[][]=new int[n][n]; // Formation of array structure
        System.out.println("Enter the elements of array : "); // Display message to enter the elements of the array
        // Taking array elements from the user
        for (c=0; c<n; c++)
        {
            for (r=0; r<n; r++)
            {
                arr[c][r]=in.nextInt();
            }
        }
        // Displaying the matrix before operation for user convenience
        System.out.println("ORIGINAL MATRIX : ");
        for (c=0; c<n; c++)
        {
            for (r=0; r<n; r++)
            {
                System.out.print(arr[c][r]+" ");
            }
            System.out.println();
        }
        // Operation for 90 degree rotate
        for (c=0; c<n/2; c++) 
        {
            for (r=c; r<n-c-1; r++) 
            {
                // store current cell in temp variable 
                int temp=arr[c][r]; 
                arr[c][r]=arr[n-1-r][c]; 
                arr[n-1-r][c]=arr[n-1-c][n-1-r]; 
                arr[n-1-c][n-1-r]=arr[r][n-1-c]; 
                arr[r][n-1-c]=temp;
            }
        }
        // Displaying the matrix
        System.out.println("MATRIX AFTER ROTATION : ");
        for (c=0; c<n; c++)
        {
            for (r=0; r<n; r++)
            {
                if((c+r)==(n-1))
                {
                    // Calculating the sum of the corners
                    sum=sum+arr[c][r];
                }
                System.out.print(arr[c][r]+" "); // Printing the matrix after rotate}
            }
            System.out.println();
        }
        System.out.println("Sum of the corner elements= "+sum); // Printing the sum of the corner elements
    }
}