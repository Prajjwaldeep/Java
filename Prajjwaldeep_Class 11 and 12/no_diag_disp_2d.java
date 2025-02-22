import java.util.*;
public class no_diag_disp_2d
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l1,c,r;
        System.out.println("Enter the limit of the array : ");
        l1=in.nextInt();
        int arr[][]=new int[l1][l1];
        System.out.println("Enter the elements of array : ");
        for (c=0; c<l1; c++)
        {
            for (r=0; r<l1; r++)
            {
                arr[c][r]=in.nextInt();
            }
        }
        System.out.println("Array elements are : ");
        for (c=0; c<l1; c++)
        {
            for (r=0; r<l1; r++)
            {
                System.out.print(arr[c][r]+" ");
            }
            System.out.println();
        }
        System.out.println("Diagonals are : ");
        for (c=0; c<l1; c++)
        {
            for (r=0; r<l1; r++)
            {
                if (c==r || (c==(l1-r-1)))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(arr[c][r]+" ");
                }
            }
            System.out.println();
        }
    }
}