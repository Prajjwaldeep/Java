/* A program to interchange the row and column in a matrix
 * For the interchange of row and column, the interchange of limit of row and column is a mandatory task
 */
import java.util.*;
public class row_column_inter_change
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); //Set scanner class to read input
        int l1,l2,c,r;
        System.out.println("Enter the limit of row and column : ");// Display message to input the limits of rows and column
        // Read the limit of row and column
        l1=in.nextInt();
        l2=in.nextInt();
        int arr[][]=new int[l1][l2]; // Formation of array structure
        System.out.println("Enter the elements of array : "); // Display message to enter the elements of the array
        // Taking array elements from the user
        for (c=0; c<l1; c++)
        {
            for (r=0; r<l2; r++)
            {
                arr[c][r]=in.nextInt();
            }
        }
        // Displaying the matrix before operation for user convenience
        System.out.println("Array elements are : ");
        for (c=0; c<l1; c++)
        {
            for (r=0; r<l2; r++)
            {
                System.out.print(arr[c][r]+" ");
            }
            System.out.println();
        }
        // Operation for row column inter-change
        System.out.println("After inter change : ");
        for (c=0; c<l2; c++)// Echanging the limits
        {
            for (r=0; r<l1; r++)// Echanging the limits here as well
            {
                System.out.print(arr[r][c]+" "); // Displaying the array elements after operation
            }
            System.out.println();
        }
    }
}