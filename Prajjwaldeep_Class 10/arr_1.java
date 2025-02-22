import java.util.Scanner;
public class arr_1
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,a;
        System.out.print("Enter the limit of array : ");
        l=in.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter the elements of array : ");
        for (a=0; a<l; a++)
        {
            arr[a]=in.nextInt();
        }
        System.out.println("Array elements are : ");
        for (a=0; a<l; a++)
        {
            System.out.println(arr[a]);
        }
    }
}