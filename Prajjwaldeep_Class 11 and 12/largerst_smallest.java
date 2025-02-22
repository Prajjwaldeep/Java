import java.util.*;
public class largerst_smallest
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,c,r;
        System.out.print("Enter the limit of the square matrix : ");
        n=in.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter "+(n*n)+" elements : ");
        for(c=0; c<n; c++)
        {
            for(r=0; r<n; r++)
            {
                arr[c][r]=in.nextInt();
            }
        }
        System.out.println("Array elements are : ");
        for(c=0; c<n; c++)
        {
            for(r=0; r<n; r++)
            {
                System.out.print(arr[c][r]+" ");
            }
            System.out.println();
        }
        int max=arr[0][0],min=arr[0][0];
        for(c=0; c<n; c++)
        {
            for(r=0; r<n; r++)
            {
                if (arr[c][r]<min)
                min=arr[c][r];
                if (arr[c][r]>max)
                max=arr[c][r];
            }
        }
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);
    }
}