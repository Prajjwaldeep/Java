import java.util.Scanner;
public class arr_2_sum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,a,sum=0;
        System.out.print("Enter the limit of array : ");
        l=in.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter the elements of array : ");
        for (a=0; a<l; a++)
        {
            arr[a]=in.nextInt();
        }
        for (a=0; a<l; a++)
        {
            sum=sum+arr[a];
        }
        System.out.println("Sum of the elements of array is "+sum);
    }
}