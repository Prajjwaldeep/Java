import java.util.*;
public class arr_2D_dia_col_row
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,c,r,sum=0,s=0,sum1=0,sum2=0,diff=0;
        System.out.print("Enter the limit of square matrix : ");
        l=in.nextInt();
        int arr[][]=new int[l][l];
        for (c=0; c<l; c++)
        {
            for (r=0; r<l; r++)
            {
                arr[c][r]=in.nextInt();
            }
        }
        System.out.println("Given Matrix : ");
        // Printing the matrix
        for (c=0; c<l; c++)
        {
            for (r=0; r<l; r++)
            {
                System.out.print(arr[c][r]+" ");
            }
            System.out.println();
        }
        // Calculate
        System.out.println();
        for(c=0;c<l; c++)
        {
            sum=0;
            s=0;
            for(r=0;r<l;r++)
            {
                sum=sum+arr[r][c];
                s=s+arr[c][r];
             }
            System.out.println("Sum of element of col "+(c+1)+" is = "+sum);
            System.out.println("Sum of element of row "+(c+1)+" is = "+s);
        }
        for (c=0; c<l; c++)
        {
            for(r=0;r<l; r++)
            {
                if (c==r)
                sum1=sum1+arr[c][r];
                if (c==(l-r-1))
                sum2=sum2+arr[c][r];
            }
        }
        System.out.println("Sum of diagonal 1 : "+sum1);
        System.out.println("Sum of diagonal 2 : "+sum2);
        if (sum1>sum2)
        {
            diff=sum1-sum2;
        }
        else
        {
            diff=sum2-sum1;
        }
        System.out.println("Difference between the diagonals : "+diff);
    }
}