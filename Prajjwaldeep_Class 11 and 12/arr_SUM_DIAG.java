import java.util.Scanner;
public class arr_SUM_DIAG
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,l1,a,b,t,sum=0;
        System.out.print("Enter the Row of array : ");
        l=in.nextInt();
        System.out.print("Enter the Column of array : ");
        l1=in.nextInt();
        int arr[][]=new int[l][l1];
        //input
        System.out.println("Enter the elements of array : ");
        for (a=0; a<l; a++)
        {
            for(b=0;b<l1; b++)
            {
                arr[a][b]=in.nextInt();
            }
        }
        System.out.println("Given Matrix : ");
        for (a=0; a<l; a++)
        {
            for(b=0;b<l1; b++)
            {
                System.out.print(arr[a][b]+" ");
            }
            System.out.println();
        }
        for (a=0; a<l; a++)
        {
            for(b=0;b<l1; b++)
            {
                if (a==b)
                sum=sum+arr[a][b];
            }
        }
        System.out.println("Sum of diagonals : "+sum);
    }
}