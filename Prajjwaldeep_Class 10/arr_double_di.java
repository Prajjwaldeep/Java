import java.util.Scanner;
public class arr_double_di
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int c,r;
        int arr[][]=new int[3][4];
        System.out.println("Enter the elements of array : ");
        for (c=0; c<3; c++)
        {
            for(r=0; r<4; r++)
            {
            arr[c][r]=in.nextInt();
        }
    }
        System.out.println("Array elements are : ");
        for (c=0; c<3; c++)
        {
            for(r=0; r<4; r++)
            {
            System.out.print(arr[c][r]+" ");
        }
        System.out.println();
    }
}
}