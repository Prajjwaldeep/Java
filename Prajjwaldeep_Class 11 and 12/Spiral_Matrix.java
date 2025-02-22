import java.util.*;
public class Spiral_Matrix
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); // Set sacnner class to read input
        System.out.print("Enter the size of the matrix : "); // Displaying message to enter the elements of the matrix
        int n=in.nextInt(); // Reading the size of the matrix
        int arr[][]=new int[n][n]; // Formation of array structure
        int i,j,k=1,c1=0,c2=n-1,r1=0,r2=n-1;
        System.out.println("Enter the elements of the matrix : "); // Displaying message to enter the elements of the matrix
        // Taking the array elements from the user
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        while(k<=n*n)
        {
            for(i=c1;i<=c2;i++)
            {
                arr[r1][i]=k++;
            }
            for(j=r1+1;j<=r2;j++)
            {
                arr[j][c2]=k++;
            }
            for(i=c2-1;i>=c1;i--)
            {
                arr[r2][i]=k++;
            }
            for(j=r2-1;j>=r1+1;j--)
            {
                arr[j][c1]=k++;
            }
            c1++;
            c2--;
            r1++;
            r2--;
        }
        // Printing the Circular matrix
        System.out.println("The Circular Matrix is:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}