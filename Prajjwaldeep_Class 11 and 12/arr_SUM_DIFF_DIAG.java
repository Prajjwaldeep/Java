import java.util.Scanner;
public class arr_SUM_DIFF_DIAG
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,a,b,t,sum1=0,sum2=0,diff;
        System.out.print("Enter the length of square matrix : ");
        l=in.nextInt();
        int arr[][]=new int[l][l];
        //input
        System.out.println("Enter the elements of array : ");
        for (a=0; a<l; a++)
        {
            for(b=0;b<l; b++)
            {
                arr[a][b]=in.nextInt();
            }
        }
        System.out.println("Given Matrix : ");
        for (a=0; a<l; a++)
        {
            for(b=0;b<l; b++)
            {
                System.out.print(arr[a][b]+" ");
            }
            System.out.println();
        }
        for (a=0; a<l; a++)
        {
            for(b=0;b<l; b++)
            {
                if (a==b)
                sum1=sum1+arr[a][b];
                if (a==(l-b-1))
                sum2=sum2+arr[a][b];
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