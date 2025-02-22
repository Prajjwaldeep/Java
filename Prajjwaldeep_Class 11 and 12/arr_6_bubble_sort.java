import java.util.Scanner;
public class arr_6_bubble_sort
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,a,b,t;
        System.out.print("Enter the limit of array : ");
        l=in.nextInt();
        int arr[]=new int[l];
        //input
        System.out.println("Enter the elements of array : ");
        for (a=0; a<l; a++)
        {
            arr[a]=in.nextInt();
        }
        //Sorting
        for (a=0; a<l; a++)
        {
            for (b=0; b<(l-1); b++)
            {
                if (arr[b]>arr[b+1])
                {
                    t=arr[b];
                    arr[b]=arr[b+1];
                    arr[b+1]=t;
                }
            }
        }
        System.out.println("Sorted elements are : ");
        for (a=0; a<l; a++)
        System.out.println(arr[a]);
        }
    }