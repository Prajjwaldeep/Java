import java.util.Scanner;
public class arr_8_deletation
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,a,p;
        System.out.print("Enter the limit of array : ");
        l=in.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter the elements of array : ");
        for (a=0; a<l; a++)
        {
            arr[a]=in.nextInt();
        }
        System.out.println("Enter the position of array elements to be deleated : ");
        p=in.nextInt();
        for (a=p; a<l; a++)
        arr[a-1]=arr[a];
        l--;
        System.out.println("Array elements after deletation are : ");
        for (a=0; a<l; a++)
            System.out.println(arr[a]);
        }
    }