import java.util.*;
public class reverse_an_array_recursion
{
    public static void reverse(int arr[], int first, int last)
    {
        if(first>last)
        {
            return;
        }
        int t;
        t=arr[first];
        arr[first]=arr[last];
        arr[last]=t;
        reverse(arr,first+1,last-1);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n;
        System.out.print("Enter the size of the array : ");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array : ");
        for(i=0; i<n; i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("After reverse : ");
        reverse(arr,0,n-1);
        for(i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}