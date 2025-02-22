import java.util.*;
public class insertion_sort
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l;
        System.out.print("Enter the length of the array : ");
        l=in.nextInt();
        int arr[]=new int[l];
        int i,j,current;
        System.out.println("Enter the elements of array : ");
        for(i=0; i<l; i++)
        {
            arr[i]=in.nextInt();
        }
        for(i=1; i<l; i++)
        {
            current=arr[i];
            j=i-1;
            while(arr[j]>current && j>=0)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("After insertion sort : ");
        for(i=0; i<l; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}