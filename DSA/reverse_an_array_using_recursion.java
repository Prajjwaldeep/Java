/*
 * Space Complexity - O(n)
 * Time Complexity - O(n)
 */
import java.util.*;
public class reverse_an_array_using_recursion
{
    public static void reverse(int arr[], int start, int end)
    {
        int temp;
        if(start>=end/2)
        {
            return;
        }
        temp=arr[start];
        arr[start]=arr[end-start-1];
        arr[end-start-1]=temp;
        reverse(arr,start+1,end);
    }
    public static void print(int arr[], int l)
    {
        int i;
        for(i=0; i<l; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the limit of an array : ");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array : ");
        for(i=0; i<n; i++)
        {
            arr[i]=in.nextInt();
        }
        reverse(arr,0,n);
        print(arr,n);
    }
}