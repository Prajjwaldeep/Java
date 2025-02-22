import java.util.*;
public class swap_alternate
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array : ");
        n=in.nextInt();
        int a;
        int arr[]=new int[n];
        for(a=0; a<n; a++)
        {
            arr[a]=in.nextInt();
        }
        int i,temp;
        for(i=0; i<arr.length; i=(i+2))
        {
            if((i+1)<arr.length)
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(a=0; a<n; a++)
        {
            System.out.print(arr[a]+" ");
        }
    }
}