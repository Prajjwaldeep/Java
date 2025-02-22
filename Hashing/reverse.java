import java.util.*;
public class reverse
{
    public static void swap(int arr[], int e1, int e2)
    {
        int t;
        t=arr[e1];
        arr[e1]=arr[e2];
        arr[e2]=t;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Limit : ");
        n=in.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0; i<n; i++)
        {
            arr[i]=in.nextInt();
        }
        i=0;
        while(i<n/2)
        {
            swap(arr, i, n-i-1);
            i++;
        }
        for(i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}